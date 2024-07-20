;; https://4clojure.oxal.org/#/problem/014
 
(ns ex.q014-test
  (:require [clojure.test :as t]
            [ex.q014 :as sut]))

(t/deftest test-q14
  (t/testing "Problem 14, Functions"
    (t/is (= ((fn add-five [x] (+ x 5)) 3) (sut/ans)))
    (t/is (= ((fn [x] (+ x 5)) 3) (sut/ans)))
    (t/is (= (#(+ % 5) 3) (sut/ans)))
    (t/is (= ((partial + 5) 3) (sut/ans)))))