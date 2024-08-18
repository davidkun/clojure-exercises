;; https://4clojure.oxal.org/#/problem/050
 
(ns ex.q050-test
  (:require [clojure.test :as t]
            [ex.q050 :as sut]))

(t/deftest test-q50
  (t/testing "Problem 50, Split by Type"
    (t/is (= #{[1 2 3] [:a :b :c]} (set (sut/ans [1 :a 2 :b 3 :c]))))
    (t/is (= #{[:a :b] ["foo" "bar"]} (set (sut/ans [:a "foo"  "bar" :b]))))
    (t/is (= #{[[1 2] [3 4]] [:a :b] [5 6]} (set (sut/ans [[1 2] :a [3 4] 5 6 :b]))))))