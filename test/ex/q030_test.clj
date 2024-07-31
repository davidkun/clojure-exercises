;; https://4clojure.oxal.org/#/problem/030
 
(ns ex.q030-test
  (:require [clojure.test :as t]
            [ex.q030 :as sut]))

(t/deftest test-q30
  (t/testing "Problem 30, Compress a Sequence"
    (t/is (= "Leroy" (apply str (sut/ans "Leeeeeerrroyyy"))))
    (t/is (= '(1 2 3 2 3) (sut/ans [1 1 2 3 3 2 2 3])))
    (t/is (= '([1 2] [3 4] [1 2]) (sut/ans [[1 2] [1 2] [3 4] [1 2]])))))