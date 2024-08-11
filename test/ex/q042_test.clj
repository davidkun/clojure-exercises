;; https://4clojure.oxal.org/#/problem/042
 
(ns ex.q042-test
  (:require [clojure.test :as t]
            [ex.q042 :as sut]))

(t/deftest test-q42
  (t/testing "Problem 42, Factorial Fun"
    (t/is (= 1 (sut/ans 1)))
    (t/is (= 6 (sut/ans 3)))
    (t/is (= 40320 (sut/ans 8)))

    (t/is (= 1 (sut/ans2 1)))
    (t/is (= 6 (sut/ans2 3)))
    (t/is (= 40320 (sut/ans2 8)))))