;; https://4clojure.oxal.org/#/problem/2

(ns ex.q002-test
  (:require [clojure.test :as t]
  [ex.q002 :as sut]))

(t/deftest test-q2
  (t/testing "Problem 2, Simple Math"
    (t/is (= (sut/ans) (- 10 (* 2 3))))))
