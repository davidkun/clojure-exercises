;; https://4clojure.oxal.org/#/problem/067
 
(ns ex.q067-test
  (:require [clojure.test :as t]
            [ex.q067 :as sut]))

(t/deftest test-q67
  (t/testing "Problem 67, Prime Numbers"
    (t/is (= [2 3] (sut/ans 2)))
    (t/is (= [2 3 5 7 11] (sut/ans 5)))
    (t/is (= 541 (last (sut/ans 100))))))