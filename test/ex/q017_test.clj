;; https://4clojure.oxal.org/#/problem/017
 
(ns ex.q017-test
  (:require [clojure.test :as t]
            [ex.q017 :as sut]))

(t/deftest test-q17
  (t/testing "Problem 17, map"
    (t/is (= (map #(+ % 5) '(1 2 3)) (sut/ans)))))