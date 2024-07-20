;; https://4clojure.oxal.org/#/problem/020
 
(ns ex.q020-test
  (:require [clojure.test :as t]
            [ex.q020 :as sut]))

(t/deftest test-q20
  (t/testing "Problem 20, Penultimate Element"
    (t/is (= 4 (sut/ans (list 1 2 3 4 5))))
    (t/is (= "b" (sut/ans ["a" "b" "c"])))
    (t/is (= [1 2] (sut/ans [[1 2] [3 4]])))))