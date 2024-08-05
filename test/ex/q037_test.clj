;; https://4clojure.oxal.org/#/problem/037
 
(ns ex.q037-test
  (:require [clojure.test :as t]
            [ex.q037 :as sut]))

(t/deftest test-q37
  (t/testing "Problem 37, Regular Expressions"
    (t/is (= (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")) (sut/ans)))))