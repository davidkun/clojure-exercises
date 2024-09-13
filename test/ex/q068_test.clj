;; https://4clojure.oxal.org/#/problem/068
 
(ns ex.q068-test
  (:require [clojure.test :as t]
            [ex.q068 :as sut]))

(defn question
  []
  (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result)))

(t/deftest test-q68
  (t/testing "Problem 68, Recurring Theme"
    (t/is (= (question) (sut/ans)))))