;; https://4clojure.oxal.org/#/problem/046
 
(ns ex.q046-test
  (:require [clojure.test :as t]
            [ex.q046 :as sut]))

(t/deftest test-q46
  (t/testing "Problem 46, Flipping out"
    (t/is (= 3 ((sut/ans nth) 2 [1 2 3 4 5])))
    (t/is (= true ((sut/ans >) 7 8)))
    (t/is (= 4 ((sut/ans quot) 2 8)))
    (t/is (= [1 2 3] ((sut/ans take) [1 2 3 4 5] 3)))))