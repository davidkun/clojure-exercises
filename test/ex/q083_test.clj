;; https://4clojure.oxal.org/#/problem/083
 
(ns ex.q083-test
  (:require [clojure.test :as t]
            [ex.q083 :as sut]))

(t/deftest test-q83
  (t/testing "Problem 83, A Half-Truth"
    (t/is (= false (sut/ans false false)))
    (t/is (= true (sut/ans true false)))
    (t/is (= false (sut/ans true)))
    (t/is (= true (sut/ans false true false)))
    (t/is (= false (sut/ans true true true)))
    (t/is (= true (sut/ans true true true false)))))
