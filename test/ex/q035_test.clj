;; https://4clojure.oxal.org/#/problem/035
 
(ns ex.q035-test
  (:require [clojure.test :as t]
            [ex.q035 :as sut]))

(t/deftest test-q35
  (t/testing "Problem 35, Local bindings"
    (t/is (= (let [x 5] (+ 2 x)) (sut/ans)))
    (t/is (= (let [x 3, y 10] (- y x)) (sut/ans)))
    (t/is (= (let [x 21] (let [y 3] (/ x y))) (sut/ans)))))