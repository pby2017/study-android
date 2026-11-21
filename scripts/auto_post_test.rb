#!/usr/bin/env ruby
# frozen_string_literal: true

require "fileutils"
require "minitest/autorun"
require "open3"
require "rbconfig"
require "tmpdir"
require "yaml"

class AutoPostTest < Minitest::Test
  SCRIPT = File.expand_path("auto_post.rb", __dir__)

  def setup
    @root = Dir.mktmpdir("study-android-auto-post")
    FileUtils.mkdir_p(File.join(@root, "_data"))
    File.write(File.join(@root, "_data", "cards.yml"), "categories: []\ncards:")
    File.write(File.join(@root, "auto-post-log.md"), "")
  end

  def teardown
    FileUtils.remove_entry(@root)
  end

  def test_appends_difficulty_and_retrieval_fields
    write_queue([valid_card])

    stdout, stderr, status = run_auto_post

    assert status.success?, "#{stdout}\n#{stderr}"
    card = YAML.load_file(File.join(@root, "_data", "cards.yml")).fetch("cards").first
    assert_equal "중급", card.fetch("level")
    assert_equal "왜 그런가요?", card.fetch("interview")
    assert_equal "이유를 설명합니다.", card.fetch("answer")
    assert_includes File.read(File.join(@root, "auto-post-log.md")), card.fetch("title")
  end

  def test_rejects_queue_card_without_learning_fields_before_writing
    card = valid_card.reject { |key, _| key == "interview" }
    write_queue([card])

    _stdout, stderr, status = run_auto_post

    refute status.success?
    assert_includes stderr, "interview"
    assert_nil YAML.load_file(File.join(@root, "_data", "cards.yml")).fetch("cards")
  end

  def test_does_not_republish_title_when_level_precedes_title
    card = valid_card
    File.write(
      File.join(@root, "_data", "cards.yml"),
      {
        "categories" => [],
        "cards" => [card]
      }.to_yaml
    )
    write_queue([card])

    stdout, stderr, status = run_auto_post

    assert status.success?, "#{stdout}\n#{stderr}"
    assert_includes stdout, "No new hot card"
    assert_equal 1, YAML.load_file(File.join(@root, "_data", "cards.yml")).fetch("cards").size
  end

  private

  def valid_card
    {
      "category" => "ai",
      "level" => "중급",
      "title" => "테스트 카드",
      "summary" => "짧은 설명",
      "points" => ["핵심 사실"],
      "source" => "https://example.com",
      "interview" => "왜 그런가요?",
      "answer" => "이유를 설명합니다."
    }
  end

  def write_queue(cards)
    File.write(File.join(@root, "_data", "ai_queue.yml"), cards.to_yaml)
  end

  def run_auto_post
    Open3.capture3({ "STUDY_ANDROID_ROOT" => @root }, RbConfig.ruby, SCRIPT)
  end
end
