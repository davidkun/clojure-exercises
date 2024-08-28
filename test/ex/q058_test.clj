;; https://4clojure.oxal.org/#/problem/058
 
(ns ex.q058-test
  (:require [clojure.test :as t]
            [ex.q058 :as sut]))

(t/deftest test-q58
  (t/testing "Problem 58, Function Composition"
    (t/is (= [3 2 1] ((sut/ans reverse) [1 2 3])))
    (t/is (= [3 2 1] ((sut/ans rest reverse) [1 2 3 4])))
    (t/is (= 5 ((sut/ans (partial + 3) second) [1 2 3 4])))
    (t/is (= true ((sut/ans zero? #(mod % 8) +) 3 5 7 9)))
    (t/is (= "HELLO" ((sut/ans #(.toUpperCase %) #(apply str %) take) 5 "hello world")))))