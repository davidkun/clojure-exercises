;; https://4clojure.oxal.org/#/problem/063
 
(ns ex.q063-test
  (:require [clojure.test :as t]
            [ex.q063 :as sut]))

(t/deftest test-q63
  (t/testing "Problem 63, Group a Sequence"
    (t/is (= {false [1 3], true [6 8]}
             (sut/ans #(> % 5) #{1 3 6 8})))
    (t/is (= {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}
             (sut/ans #(apply / %) [[1 2] [2 4] [4 6] [3 6]])))
    (t/is (= {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]}
             (sut/ans count [[1] [1 2] [3] [1 2 3] [2 3]])))))