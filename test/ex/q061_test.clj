;; https://4clojure.oxal.org/#/problem/061
 
(ns ex.q061-test
  (:require [clojure.test :as t]
            [ex.q061 :as sut]))

(t/deftest test-q61
  (t/testing "Problem 61, Map Construction"
    (t/is (= {:a 1, :b 2, :c 3} (sut/ans [:a :b :c] [1 2 3])))
    (t/is (= {1 "one", 2 "two", 3 "three"} (sut/ans [1 2 3 4] ["one" "two" "three"])))
    (t/is (= {:foo "foo", :bar "bar"} (sut/ans [:foo :bar] ["foo" "bar" "baz"])))))