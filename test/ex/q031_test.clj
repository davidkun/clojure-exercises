;; https://4clojure.oxal.org/#/problem/031
 
(ns ex.q031-test
  (:require [clojure.test :as t]
            [ex.q031 :as sut]))

(t/deftest test-q31
  (t/testing "Problem 31, Pack a Sequence"
    (t/is (= '((1 1) (2) (1 1 1) (3 3)) (sut/ans [1 1 2 1 1 1 3 3])))
    (t/is (= '((:a :a) (:b :b) (:c)) (sut/ans [:a :a :b :b :c])))
    (t/is (= '(([1 2] [1 2]) ([3 4])) (sut/ans [[1 2] [1 2] [3 4]])))))