#!/usr/bin/env ruby
# frozen_string_literal: true

require "date"
require "yaml"
require "fileutils"

ROOT = File.expand_path("..", __dir__)
cards_path = File.join(ROOT, "_data", "cards.yml")
queue_path = File.join(ROOT, "_data", "ai_queue.yml")
log_path = File.join(ROOT, "auto-post-log.md")

cards_text = File.read(cards_path, encoding: "UTF-8")
existing_titles = cards_text.scan(/^  - category: .*?\n    title: (.+)$/).flatten.map { |t| t.delete_prefix("\"").delete_suffix("\"") }
queue = YAML.load_file(queue_path) || []

next_card = queue.find { |card| !existing_titles.include?(card.fetch("title")) }

unless next_card
  puts "No new hot card to append."
  exit 0
end

def q(str)
  '"' + str.gsub("\\", "\\\\").gsub('"', '\"') + '"'
end

summary = next_card.fetch("summary").strip.gsub("\n", "\n      ")
points = next_card.fetch("points").map { |p| "      - #{q(p)}\n" }.join

snippet = <<~YAML

  - category: #{next_card.fetch("category")}
    title: #{q(next_card.fetch("title"))}
    summary: >
      #{summary}
    points:
#{points}    source: #{q(next_card.fetch("source"))}
YAML

File.open(cards_path, "a", encoding: "UTF-8") { |f| f.write(snippet) }

timestamp = Time.now.getlocal("+09:00").strftime("%Y-%m-%d %H:%M KST")
File.open(log_path, "a", encoding: "UTF-8") do |f|
  f.puts "- #{timestamp} | #{next_card.fetch('title')} | #{next_card.fetch('source')}"
end

puts "Appended: #{next_card.fetch('title')}"
