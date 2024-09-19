;; https://4clojure.oxal.org/#/problem/075
 
(ns ex.q075-test
  (:require [clojure.test :as t]
            [ex.q075 :as sut]))

(t/deftest test-q75
  (t/testing "Problem 75, Euler's Totient Function"
    (t/is (= 1 (sut/ans 1)))
    (t/is (= (count '(1 3 7 9)) 4 (sut/ans 10)))
    (t/is (= 16 (sut/ans 40)))
    (t/is (= 60 (sut/ans 99)))))