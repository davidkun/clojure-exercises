;; https://4clojure.oxal.org/#/problem/052
 
(ns ex.q052-test
  (:require [clojure.test :as t]
            [ex.q052 :as sut]))

(t/deftest test-q52
  (t/testing "Problem 52, Intro to Destructuring"
    (t/is (= [2 4] (sut/ans)))))