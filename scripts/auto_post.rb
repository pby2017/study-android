#!/usr/bin/env ruby
# frozen_string_literal: true

require "date"
require "yaml"
require "fileutils"

ROOT = ENV.fetch("STUDY_ANDROID_ROOT", File.expand_path("..", __dir__))
cards_path = File.join(ROOT, "_data", "cards.yml")
queue_path = File.join(ROOT, "_data", "ai_queue.yml")
log_path = File.join(ROOT, "auto-post-log.md")

cards_data = YAML.load_file(cards_path) || {}
existing_titles = (cards_data["cards"] || []).map { |card| card.fetch("title") }
queue = YAML.load_file(queue_path) || []

next_card = queue.find { |card| !existing_titles.include?(card.fetch("title")) }

unless next_card
  puts "No new hot card to append."
  exit 0
end

required_fields = %w[category level title summary points source interview answer]
missing_fields = required_fields.reject { |field| next_card.key?(field) }
abort "Queued card is missing required learning fields: #{missing_fields.join(', ')}" unless missing_fields.empty?
abort "Card level must be 초급, 중급, or 고급" unless %w[초급 중급 고급].include?(next_card["level"])
abort "Card points must be a non-empty list" unless next_card["points"].is_a?(Array) && !next_card["points"].empty?

def q(str)
  '"' + str.gsub("\\", "\\\\").gsub('"', '\"') + '"'
end

summary = next_card.fetch("summary").strip.gsub("\n", "\n      ")
points = next_card.fetch("points").map { |p| "      - #{q(p)}\n" }.join

snippet = <<~YAML

  - category: #{next_card.fetch("category")}
    level: #{q(next_card.fetch("level"))}
    title: #{q(next_card.fetch("title"))}
    summary: >
      #{summary}
    points:
#{points}    source: #{q(next_card.fetch("source"))}
    interview: #{q(next_card.fetch("interview"))}
    answer: #{q(next_card.fetch("answer"))}
YAML

File.open(cards_path, "a", encoding: "UTF-8") { |f| f.write(snippet) }

timestamp = Time.now.getlocal("+09:00").strftime("%Y-%m-%d %H:%M KST")
File.open(log_path, "a", encoding: "UTF-8") do |f|
  f.puts "- #{timestamp} | #{next_card.fetch('title')} | #{next_card.fetch('source')}"
end

puts "Appended: #{next_card.fetch('title')}"
