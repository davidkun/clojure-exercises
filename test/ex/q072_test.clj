;; https://4clojure.oxal.org/#/problem/072
 
(ns ex.q072-test
  (:require [clojure.test :as t]
            [ex.q072 :as sut]))

(t/deftest test-q72
  (t/testing "Problem 72, Rearranging Code: ->>"
    (t/is (= (apply + (map inc (take 3 (drop 2 [2 5 4 1 3 6])))) (sut/ans)))))