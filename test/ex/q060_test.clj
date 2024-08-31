;; https://4clojure.oxal.org/#/problem/060
 
(ns ex.q060-test
  (:require [clojure.test :as t]
            [ex.q060 :as sut]))

(t/deftest test-q60
  (t/testing "Problem 60, Sequence Reductions"
    (t/is (= [0 1 3 6 10] (take 5 (sut/ans + (range)))))
    (t/is (= [[1] [1 2] [1 2 3] [1 2 3 4]] (sut/ans conj [1] [2 3 4])))
    (t/is (= 120 (reduce * 2 [3 4 5]) (last (sut/ans * 2 [3 4 5]))))))