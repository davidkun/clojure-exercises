;; https://4clojure.oxal.org/#/problem/012
 
(ns ex.q012-test
  (:require [clojure.test :as t]
            [ex.q012 :as sut]))

(t/deftest test-q12
  (t/testing "Problem 12, Sequences"
  (t/is (= (first '(3 2 1)) (sut/ans)))
  (t/is (= (second [2 3 4]) (sut/ans)))
  (t/is (= (last (list 1 2 3)) (sut/ans)))))