;; https://4clojure.oxal.org/#/problem/064
 
(ns ex.q064-test
  (:require [clojure.test :as t]
            [ex.q064 :as sut]))

(t/deftest test-q64
  (t/testing "Problem 64, Intro to Reduce"
    (t/is (= 15 (reduce (sut/ans) [1 2 3 4 5])))
    (t/is (= 0 (reduce (sut/ans) [])))
    (t/is (= 6 (reduce (sut/ans) 1 [2 3])))))