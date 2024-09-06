;; https://4clojure.oxal.org/#/problem/065
 
(ns ex.q065-test
  (:require [clojure.test :as t]
            [ex.q065 :as sut]))

(t/deftest test-q65
  (t/testing "Problem 65, Black Box Testing"
    (t/is (= :map (sut/ans {:a 1, :b 2})))
    (t/is (= :list (sut/ans (range (rand-int 20)))))
    (t/is (= :vector (sut/ans [1 2 3 4 5 6])))
    (t/is (= [:map :set :vector :list] (map sut/ans [{} #{} [] ()])))))