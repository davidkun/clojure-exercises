;; https://4clojure.oxal.org/#/problem/011
 
(ns ex.q011-test
  (:require [clojure.test :as t]
            [ex.q011 :as sut]))

(t/deftest test-q11
  (t/testing "Problem 11, conj on maps"
    (t/is (= {:a 1, :b 2, :c 3} (sut/ans)))))