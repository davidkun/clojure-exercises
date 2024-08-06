;; https://4clojure.oxal.org/#/problem/039
 
(ns ex.q039-test
  (:require [clojure.test :as t]
            [ex.q039 :as sut]))

(t/deftest test-q39
  (t/testing "Problem 39, Interleave Two Seqs"
    (t/is (= '(1 :a 2 :b 3 :c) (sut/ans [1 2 3] [:a :b :c])))
    (t/is (= '(1 3 2 4) (sut/ans [1 2] [3 4 5 6])))
    (t/is (= [1 5] (sut/ans [1 2 3 4] [5])))
    (t/is (= [30 25 20 15] (sut/ans [30 20] [25 15])))))