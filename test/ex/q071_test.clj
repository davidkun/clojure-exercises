;; https://4clojure.oxal.org/#/problem/071
 
(ns ex.q071-test
  (:require [clojure.test :as t]
            [ex.q071 :as sut]))

(t/deftest test-q71
  (t/testing "Problem 71, Rearranging Code: ->"
    (t/is (= (last (sort (rest (reverse [2 5 4 1 3 6])))) (sut/ans)))))