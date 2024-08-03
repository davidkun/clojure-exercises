;; https://4clojure.oxal.org/#/problem/033
 
(ns ex.q033-test
  (:require [clojure.test :as t]
            [ex.q033 :as sut]))

(t/deftest test-q33
  (t/testing "Problem 33, Replicate a Sequence"
    (t/is (= '(1 1 2 2 3 3) (sut/ans [1 2 3] 2)))
    (t/is (= '(:a :a :a :a :b :b :b :b) (sut/ans [:a :b] 4)))
    (t/is (= '(4 5 6) (sut/ans [4 5 6] 1)))
    (t/is (= '([1 2] [1 2] [3 4] [3 4]) (sut/ans [[1 2] [3 4]] 2)))
    (t/is (= [44 44 33 33] (sut/ans [44 33] 2)))))