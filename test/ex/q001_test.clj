;; https://4clojure.oxal.org/#/problem/1

(ns ex.q001-test
  (:require [clojure.test :as t]
            [ex.q001 :as sut]))

(t/deftest test-ans
  (t/testing "Problem 1, Nothing but the Truth"
    (t/is (= (sut/ans) true))))
