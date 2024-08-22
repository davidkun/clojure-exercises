;; https://4clojure.oxal.org/#/problem/054
 
(ns ex.q054-test
  (:require [clojure.test :as t]
            [ex.q054 :as sut]))

(t/deftest test-q54
  (t/testing "Problem 54, Partition a Sequence"
    (t/is (= '((0 1 2) (3 4 5) (6 7 8)) (sut/ans 3 (range 9))))
    (t/is (= '((0 1) (2 3) (4 5) (6 7)) (sut/ans 2 (range 8))))
    (t/is (= '((0 1 2) (3 4 5)) (sut/ans 3 (range 8))))))