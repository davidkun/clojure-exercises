;; https://4clojure.oxal.org/#/problem/034
 
(ns ex.q034-test
  (:require [clojure.test :as t]
            [ex.q034 :as sut]))

(t/deftest test-q34
  (t/testing "Problem 34, Implement range"
    (t/is (= '(1 2 3) (sut/ans 1 4)))
    (t/is (= '(-2 -1 0 1) (sut/ans -2 2)))
    (t/is (= '(5 6 7) (sut/ans 5 8)))))