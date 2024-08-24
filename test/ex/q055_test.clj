;; https://4clojure.oxal.org/#/problem/055
 
(ns ex.q055-test
  (:require [clojure.test :as t]
            [ex.q055 :as sut]))
(t/deftest test-q55
  (t/testing "Problem 55, Count Occurences"
    (t/is (= {1 4, 2 2, 3 1} (sut/ans [1 1 2 3 2 1 1])))
    (t/is (= {:a 2, :b 3} (sut/ans [:b :a :b :a :b])))
    (t/is (= {[1 2] 1, [1 3] 2} (sut/ans '([1 2] [1 3] [1 3]))))))