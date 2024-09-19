;; https://4clojure.oxal.org/#/problem/074
 
(ns ex.q074-test
  (:require [clojure.test :as t]
            [ex.q074 :as sut]))

(t/deftest test-q74
  (t/testing "Problem 74, Filter Perfect Squares"
    (t/is (= "4,9" (sut/ans "4,5,6,7,8,9")))
    (t/is (= "16,25,36" (sut/ans "15,16,25,36,37")))
    (t/is (= "1,9,100" (sut/ans "1,2,5,6,9,11,20,30,100,101")))))