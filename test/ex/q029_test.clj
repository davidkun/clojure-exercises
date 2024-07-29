;; https://4clojure.oxal.org/#/problem/029
 
(ns ex.q029-test
  (:require [clojure.test :as t]
            [ex.q029 :as sut]))

(t/deftest test-q29
  (t/testing "Problem 29, Get the Caps"
    (t/is (= "HLOWRD" (sut/ans "HeLlO, WoRlD!")))
    (t/is (empty? (sut/ans "nothing")))
    (t/is (= "AZ" (sut/ans "$#A(*&987Zf")))))