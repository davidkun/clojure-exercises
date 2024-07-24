;; https://4clojure.oxal.org/#/problem/026
 
(ns ex.q026-test
  (:require [clojure.test :as t]
            [ex.q026 :as sut]))

(t/deftest test-q26
  (t/testing "Problem 26, Fibonacci Sequence"
    (t/is (= '(1 1 2) (sut/ans 3)))
    (t/is (= '(1 1 2 3 5 8) (sut/ans 6)))
    (t/is (= '(1 1 2 3 5 8 13 21) (sut/ans 8)))))