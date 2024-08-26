;; https://4clojure.oxal.org/#/problem/057
 
(ns ex.q057-test
  (:require [clojure.test :as t]
            [ex.q057 :as sut]))

(t/deftest test-q57
  (t/testing "Problem 57, Simple Recursion"
    (t/is (= ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5) (sut/ans)))))