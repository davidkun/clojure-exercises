;; https://4clojure.oxal.org/#/problem/010
 
(ns ex.q010-test
  (:require [clojure.test :as t]
            [ex.q010 :as sut]))

(t/deftest test-q10
  (t/testing "Problem 10, Maps"
    (t/is (= ((hash-map :a 10, :b 20, :c 30) :b) (sut/ans)))
    (t/is (= (:b {:a 10, :b 20, :c 30}) (sut/ans)))))