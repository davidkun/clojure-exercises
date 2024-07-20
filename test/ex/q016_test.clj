;; https://4clojure.oxal.org/#/problem/016
 
(ns ex.q016-test
  (:require [clojure.test :as t]
            [ex.q016 :as sut]))

(t/deftest test-q16
  (t/testing "Problem 16, Hello World"
    (t/is (= "Hello, Dave!" (sut/ans "Dave")))
    (t/is (= "Hello, Jen!" (sut/ans "Jen")))
    (t/is (= "Hello, Rhea!" (sut/ans "Rhea")))))