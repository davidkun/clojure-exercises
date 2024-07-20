;; https://4clojure.oxal.org/#/problem/013
 
(ns ex.q013-test
  (:require [clojure.test :as t]
            [ex.q013 :as sut]))

(t/deftest test-q13
  (t/testing "Problem 13, rest"
    (t/is (= (rest [10 20 30 40]) (sut/ans)))))