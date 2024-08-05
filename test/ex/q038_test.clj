;; https://4clojure.oxal.org/#/problem/038
 
(ns ex.q038-test
  (:require [clojure.test :as t]
            [ex.q038 :as sut]))

(t/deftest test-q38
  (t/testing "Problem 38, Maximum value"
    (t/is (= 8 (sut/ans 1 8 3 4)))
    (t/is (= 30 (sut/ans 30 20)))
    (t/is (= 67 (sut/ans 45 67 11)))))