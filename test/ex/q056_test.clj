;; https://4clojure.oxal.org/#/problem/056
 
(ns ex.q056-test
  (:require [clojure.test :as t]
            [ex.q056 :as sut]))

(t/deftest test-q56
  (t/testing "Problem 56, Find Distinct Items"
    (t/is (= [1 2 3 4] (sut/ans [1 2 1 3 1 2 4])))
    (t/is (= [:a :b :c] (sut/ans [:a :a :b :b :c :c])))
    (t/is (= '([2 4] [1 2] [1 3]) (sut/ans '([2 4] [1 2] [1 3] [1 3]))))
    (t/is (= (range 50) (sut/ans (range 50))))))