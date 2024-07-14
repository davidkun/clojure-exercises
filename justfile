# list commands
default:
  just --list

# run tests with kaocha
test:
  bin/kaocha --no-watch

# watch files and run tests continuously
watch:
  bin/kaocha --watch

# run clj-kondo to lint files under src/
lint:
  clj -M:clj-kondo --lint src --parallel

# format code with cljfmt
format:
  clj -M:cljfmt