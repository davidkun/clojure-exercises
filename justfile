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

# create files for new problem set
create prob_num: (_create_src prob_num) (_create_test prob_num)
  @echo 'Created q{{prob_num}}.clj and tests'


_create_src num:
  @echo ";; https://4clojure.oxal.org/#/problem/{{num}}" > 'src/ex/q{{num}}.clj'
  @echo ' ' >> 'src/ex/q{{num}}.clj'
  @echo '(ns ex.q{{num}})' >> 'src/ex/q{{num}}.clj'

_create_test num:
  @echo ";; https://4clojure.oxal.org/#/problem/{{num}}" > 'test/ex/q{{num}}_test.clj'
  @echo ' ' >> 'test/ex/q{{num}}_test.clj'
  @echo '(ns ex.q{{num}}-test' >> 'test/ex/q{{num}}_test.clj'
  @echo '  (:require [clojure.test :as t]' >> 'test/ex/q{{num}}_test.clj'
  @echo '            [ex.q{{num}} :as sut]))' >> 'test/ex/q{{num}}_test.clj'