;; https://4clojure.oxal.org/#/problem/019
 
(ns ex.q019-test
  (:require [clojure.test :as t]
            [ex.q019 :as sut]))

(t/deftest test-q19
  (t/testing "Problem 19, Last Element (restriction: last)"
    (t/is (= 5 (sut/ans [1 2 3 4 5])))
    (t/is (= 3 (sut/ans '(5 4 3))))
    (t/is (= "d" (sut/ans ["b" "c" "d"])))))