;; https://4clojure.oxal.org/#/problem/045
 
(ns ex.q045-test
  (:require [clojure.test :as t]
            [ex.q045 :as sut]))

(t/deftest test-q45
  (t/testing "Problem 45, Intro to Iterate"
    (t/is (= (take 5 (iterate #(+ 3 %) 1)) (sut/ans)))))