;; https://4clojure.oxal.org/#/problem/049
 
(ns ex.q049-test
  (:require [clojure.test :as t]
            [ex.q049 :as sut]))

(t/deftest test-q49
  (t/testing "Problem 49, Split a sequence"
    (t/is (= [[1 2 3] [4 5 6]] (sut/ans 3 [1 2 3 4 5 6])))
    (t/is (= [[:a] [:b :c :d]] (sut/ans 1 [:a :b :c :d])))
    (t/is (= [[[1 2] [3 4]] [[5 6]]] (sut/ans 2 [[1 2] [3 4] [5 6]])))))