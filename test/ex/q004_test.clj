;; https://4clojure.oxal.org/#/problem/4

(ns ex.q004-test
  (:require [clojure.test :as t]
            [ex.q004 :as sut]))

(t/deftest test-q4
  (t/testing "Problem 4, Lists"
    (t/is (= '(:a :b :c) (sut/ans)))))