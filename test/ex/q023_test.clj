;; https://4clojure.oxal.org/#/problem/023
 
(ns ex.q023-test
  (:require [clojure.test :as t]
            [ex.q023 :as sut]))

(t/deftest test-q23
  (t/testing "Problem 23, Reverse a Sequence"
    (t/is (= [5 4 3 2 1] (sut/ans [1 2 3 4 5])))
    (t/is (= '(7 5 2) (sut/ans (sorted-set 5 7 2 7))))
    (t/is (= [[5 6] [3 4] [1 2]] (sut/ans [[1 2] [3 4] [5 6]])))))