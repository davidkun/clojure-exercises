;; https://4clojure.oxal.org/#/problem/053
 
(ns ex.q053-test
  (:require [clojure.test :as t]
            [ex.q053 :as sut]))

(t/deftest test-q53
  (t/testing "Problem 53, Longest Increasing Sub-Seq"
    (t/is (= [0 1 2 3] (sut/ans [1 0 1 2 3 0 4 5])))
    (t/is (= [5 6] (sut/ans [5 6 1 3 2 7])))
    (t/is (= [3 4 5] (sut/ans [2 3 3 4 5])))
    (t/is (= [] (sut/ans [7 6 5 4])))))