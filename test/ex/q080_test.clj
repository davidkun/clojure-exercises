;; https://4clojure.oxal.org/#/problem/080
 
(ns ex.q080-test
  (:require [clojure.test :as t]
            [ex.q080 :as sut]))

(t/deftest test-q80
  (t/testing "Problem 80, Perfect Numbers"
    (t/is (= true (sut/ans 6)))
    (t/is (= false (sut/ans 7)))
    (t/is (= true (sut/ans 496)))
    (t/is (= false (sut/ans 500)))
    (t/is (= true (sut/ans 8128)))))