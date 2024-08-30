;; https://4clojure.oxal.org/#/problem/059
 
(ns ex.q059-test
  (:require [clojure.test :as t]
            [ex.q059 :as sut]))

(t/deftest test-q59
  (t/testing "Problem 59, Juxtaposition"
    (t/is (= [6] ((sut/ans +) 1 2 3)))
    (t/is (= [21 6 1] ((sut/ans + max min) 2 3 5 1 6 4)))
    (t/is (= ["HELLO" 5] ((sut/ans #(.toUpperCase %) count) "hello")))
    (t/is (= [2 6 4] ((sut/ans :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10})))
    ))