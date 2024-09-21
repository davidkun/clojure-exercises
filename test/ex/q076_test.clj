;; https://4clojure.oxal.org/#/problem/076
 
(ns ex.q076-test
  (:require [clojure.test :as t]
            [ex.q076 :as sut]))

(t/deftest test-q76
  (t/testing "Problem 76, Intro to Trampoline"
    (t/is (= (letfn
              [(foo [x y] #(bar (conj x y) y))
               (bar [x y] (if (> (last x) 10)
                            x
                            #(foo x (+ 2 y))))]
               (trampoline foo [] 1))
             (sut/ans)))))