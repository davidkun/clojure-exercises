;; https://4clojure.oxal.org/#/problem/047
 
(ns ex.q047-test
  (:require [clojure.test :as t]
            [ex.q047 :as sut]))

(t/deftest test-q47
  (t/testing "Problem 47, Contain Yourself"
    (t/is (contains? #{4 5 6} (sut/ans)))
    (t/is (contains? [1 1 1 1 1] (sut/ans)))
    (t/is (contains? {4 :a 2 :b} (sut/ans)))
    (t/is (not (contains? [1 2 4] (sut/ans))))))