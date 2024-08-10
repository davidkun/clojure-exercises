;; https://4clojure.oxal.org/#/problem/043
 
(ns ex.q043-test
  (:require [clojure.test :as t]
            [ex.q043 :as sut]))

(t/deftest test-q43
  (t/testing "Problem 43, Reverse Interleave"
    (t/is (= '((1 3 5) (2 4 6)) (sut/ans [1 2 3 4 5 6] 2)))
    (t/is (= '((0 3 6) (1 4 7) (2 5 8)) (sut/ans (range 9) 3)))
    (t/is (= '((0 5) (1 6) (2 7) (3 8) (4 9)) (sut/ans (range 10) 5)))))