;; https://4clojure.oxal.org/#/problem/048
 
(ns ex.q048-test
  (:require [clojure.test :as t]
            [ex.q048 :as sut]))

(t/deftest test-q48
  (t/testing "Problem 48, Intro to some"
    (t/is (= (some #{2 7 6} [5 6 7 8]) (sut/ans)))
    (t/is (= (some #(when (even? %) %) [5 6 7 8]) (sut/ans)))))