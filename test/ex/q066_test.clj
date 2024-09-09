;; https://4clojure.oxal.org/#/problem/066
 
(ns ex.q066-test
  (:require [clojure.test :as t]
            [ex.q066 :as sut]))

(t/deftest test-q66
  (t/testing "Problem 66, Greatest Common Divisor"
    (t/is (= 2 (sut/ans 2 4)))
    (t/is (= 5 (sut/ans 10 5)))
    (t/is (= 1 (sut/ans 5 7)))
    (t/is (= 33 (sut/ans 1023 858)))
    ;; version 2
    (t/is (= 2 (sut/ans2 2 4)))
    (t/is (= 5 (sut/ans2 10 5)))
    (t/is (= 1 (sut/ans2 5 7)))
    (t/is (= 33 (sut/ans2 1023 858)))))