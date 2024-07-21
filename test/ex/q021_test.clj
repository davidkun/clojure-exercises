;; https://4clojure.oxal.org/#/problem/021
 
(ns ex.q021-test
  (:require [clojure.test :as t]
            [ex.q021 :as sut]))

(t/deftest test-q21-a
  (t/testing "Problem 21, Nth Element"
    (t/is (= 6 (sut/ans '(4 5 6 7) 2)))
    (t/is (= :a (sut/ans [:a :b :c] 0)))
    (t/is (= 2 (sut/ans [1 2 3 4] 1)))
    (t/is (= [5 6] (sut/ans '([1 2] [3 4] [5 6]) 2)))))

(t/deftest test-q21-b
  (t/testing "Problem 21, Nth Element"
    (t/is (= 6 (sut/ans2 '(4 5 6 7) 2)))
    (t/is (= :a (sut/ans2 [:a :b :c] 0)))
    (t/is (= 2 (sut/ans2 [1 2 3 4] 1)))
    (t/is (= [5 6] (sut/ans2 '([1 2] [3 4] [5 6]) 2)))))