;; https://4clojure.oxal.org/#/problem/036
 
(ns ex.q036-test
  (:require [clojure.test :as t]
            [ex.q036 :as sut]))

(t/deftest test-q36
  (t/testing "Problem 36, Let it Be"
    (t/is (= [10 4 1] (sut/ans)))))