;; https://4clojure.oxal.org/#/problem/015
 
(ns ex.q015-test
  (:require [clojure.test :as t]
            [ex.q015 :as sut]))

(t/deftest test-q15
  (t/testing "Problem 15, Double Down"
    (t/is (= 4 (sut/ans 2)))
    (t/is (= 6 (sut/ans 3)))
    (t/is (= 22 (#(* % 2) 11))) ;; another way
    (t/is (= 14 ((partial * 2) 7))))) ;; another way