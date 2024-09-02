;; https://4clojure.oxal.org/#/problem/062
 
(ns ex.q062-test
  (:require [clojure.test :as t]
            [ex.q062 :as sut]))

(t/deftest test-q62
  (t/testing "Problem 62, Re-implement Iteration"
    (t/is (= [1 2 4 8 16] (take 5 (sut/ans #(* 2 %) 1))))
    (t/is (= (take 100 (range)) (take 100 (sut/ans inc 0))))
    (t/is (= (take 9 (cycle [1 2 3])) (take 9 (sut/ans #(inc (mod % 3)) 1))))))