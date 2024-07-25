;; https://4clojure.oxal.org/#/problem/027
 
(ns ex.q027-test
  (:require [clojure.test :as t]
            [ex.q027 :as sut]))

(t/deftest test-q27
  (t/testing "Problem 27, Palindrome Detector"
    (t/is (false? (sut/ans '(1 2 3 4 5))))
    (t/is (true? (sut/ans "racecar")))
    (t/is (true? (sut/ans [:foo :bar :foo])))
    (t/is (true? (sut/ans '(1 1 3 3 1 1))))
    (t/is (false? (sut/ans '(:a :b :c))))))