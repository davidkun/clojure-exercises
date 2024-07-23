;; https://4clojure.oxal.org/#/problem/025
 
(ns ex.q025-test
  (:require [clojure.test :as t]
            [ex.q025 :as sut]))

(t/deftest test-q25
  (t/testing "Problem 25, Find the odd numbers"
    (t/is (= '(1 3 5) (sut/ans #{1 2 3 4 5})))
    (t/is (= '(1) (sut/ans [4 2 1 6])))
    (t/is (= '() (sut/ans [2 2 4 6])))
    (t/is (= '(1 1 1 3) (sut/ans [1 1 1 3])))))