;; https://4clojure.oxal.org/#/problem/079
 
(ns ex.q079-test
  (:require [clojure.test :as t]
            [ex.q079 :as sut]))

(t/deftest test-q79
  (t/testing "Problem 79, Triangle Minimal Path"
    (t/is (= 7
             (+ 1 2 1 3)
             (sut/ans
              [[1]
               [2 4]
               [5 1 4]
               [2 3 4 5]])))
    (t/is (= 20
             (+ 3 4 3 2 7 1)
             (sut/ans
              [[3]
               [2 4]
               [1 9 3]
               [9 9 2 4]
               [4 6 6 7 8]
               [5 7 3 5 1 4]])))))