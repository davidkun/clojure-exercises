;; https://4clojure.oxal.org/#/problem/086
 
(ns ex.q086-test
  (:require [clojure.test :as t]
            [ex.q086 :as sut]))

(t/deftest test-q86
  (t/testing "Problem 86, Happy numbers"
    (t/is (= true (sut/ans 7)))
    (t/is (= true (sut/ans 986543210)))
    (t/is (= false (sut/ans 2)))
    (t/is (= false (sut/ans 3)))))