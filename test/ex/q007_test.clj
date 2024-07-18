;; https://4clojure.oxal.org/#/problem/7

(ns ex.q007-test
  (:require [clojure.test :as t]
            [ex.q007 :as sut]))

(t/deftest test-q7
  (t/testing "Problem 7, conj on vectors"
    (t/is (= (conj [1 2 3] 4) (sut/ans)))
    (t/is (= (conj [1 2] 3 4) (sut/ans)))))