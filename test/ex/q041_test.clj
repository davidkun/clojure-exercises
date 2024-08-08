;; https://4clojure.oxal.org/#/problem/041
 
(ns ex.q041-test
  (:require [clojure.test :as t]
            [ex.q041 :as sut]))

(t/deftest test-q41
  (t/testing "Problem 41, Drop Every Nth Item"
    (t/is (= [1 2 4 5 7 8] (sut/ans [1 2 3 4 5 6 7 8] 3)))
    (t/is (= [:a :c :e] (sut/ans [:a :b :c :d :e :f] 2)))
    (t/is (= [1 2 3 5 6] (sut/ans [1 2 3 4 5 6] 4)))))