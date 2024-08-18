;; https://4clojure.oxal.org/#/problem/051
 
(ns ex.q051-test
  (:require [clojure.test :as t]
            [ex.q051 :as sut]))

(t/deftest test-q50
  (t/testing "Problem 51, Advanced Destructuring"
    (t/is (= [1 2 [3 4 5] [1 2 3 4 5]] (sut/ans)))))