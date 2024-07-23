;; https://4clojure.oxal.org/#/problem/024
 
(ns ex.q024-test
  (:require [clojure.test :as t]
            [ex.q024 :as sut]))

(t/deftest test-q24
  (t/testing "Problem 24, Sum It All Up"
    (t/is (= 6 (sut/ans [1 2 3])))
    (t/is (= 8 (sut/ans (list 0 -2 5 5))))
    (t/is (= 7 (sut/ans #{4 2 1})))
    (t/is (= -1 (sut/ans '(0 0 -1))))
    (t/is (= 14 (sut/ans '(1 10 3))))))