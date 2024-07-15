;; https://4clojure.oxal.org/#/problem/3

(ns ex.q003-test
  (:require [clojure.test :as t]
            [ex.q003 :as sut]))

(t/deftest test-q3
  (t/testing "Problem 3, Strings"
    (t/is (= (sut/ans) (.toUpperCase "hello world")))))