;; https://4clojure.oxal.org/#/problem/073
 
(ns ex.q073-test
  (:require [clojure.test :as t]
            [ex.q073 :as sut]))

(t/deftest test-q73
  (t/testing "Problem 73, Analyze a Tic-Tac-Toe Board"
    (t/is (= nil (sut/ans [[:e :e :e]
                           [:e :e :e]
                           [:e :e :e]])))
    (t/is (= :x (sut/ans [[:x :e :o]
                          [:x :e :e]
                          [:x :e :o]])))
    (t/is (= :o (sut/ans [[:e :x :e]
                          [:o :o :o]
                          [:x :e :x]])))
    (t/is (= nil (sut/ans [[:x :e :o]
                           [:x :x :e]
                           [:o :x :o]])))
    (t/is (= :x (sut/ans [[:x :e :e]
                          [:o :x :e]
                          [:o :e :x]])))
    (t/is (= :o (sut/ans [[:x :e :o]
                          [:x :o :e]
                          [:o :e :x]])))
    (t/is (= nil (sut/ans [[:x :o :x]
                           [:x :o :x]
                           [:o :x :o]])))))