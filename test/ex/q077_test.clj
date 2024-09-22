;; https://4clojure.oxal.org/#/problem/077
 
(ns ex.q077-test
  (:require [clojure.test :as t]
            [ex.q077 :as sut]))

(t/deftest test-q77
  (t/testing "Problem 77, Anagram Finder"
    (t/is (= #{#{"meat" "team" "mate"}}
             (sut/ans ["meat" "mat" "team" "mate" "eat"])))
    (t/is (= #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}
             (sut/ans ["veer" "lake" "item" "kale" "mite" "ever"])))))