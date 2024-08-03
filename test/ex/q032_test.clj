;; https://4clojure.oxal.org/#/problem/032
 
(ns ex.q032-test
  (:require [clojure.test :as t]
            [ex.q032 :as sut]))

(t/deftest test-q32
  (t/testing "Problem 32, Duplicate a Sequence"
    (t/is (= '(1 1 2 2 3 3) (sut/ans [1 2 3])))
    (t/is (= '(:a :a :a :a :b :b :b :b) (sut/ans [:a :a :b :b])))
    (t/is (= '([1 2] [1 2] [3 4] [3 4]) (sut/ans [[1 2] [3 4]])))
    (t/is (= [44 44 33 33] (sut/ans [44 33])))))