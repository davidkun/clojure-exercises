;; https://4clojure.oxal.org/#/problem/018
 
(ns ex.q018-test
  (:require [clojure.test :as t]
            [ex.q018 :as sut]))

(t/deftest test-q18
  (t/testing "Problem 18, filter"
    (t/is (= (filter #(> % 5) '(3 4 5 6 7)) (sut/ans)))))