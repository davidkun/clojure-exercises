;; https://4clojure.oxal.org/#/problem/5

(ns ex.q005-test
  (:require [clojure.test :as t]
            [ex.q005 :as sut]))

(t/deftest test-q5
  (t/testing "Problem 5, conj on lists"
    (t/is (= (conj '(2 3 4) 1) (sut/ans)))
    (t/is (= (conj '(3 4) 2 1) (sut/ans)))))