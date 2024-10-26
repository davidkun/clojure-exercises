;; https://4clojure.oxal.org/#/problem/085
 
(ns ex.q085-test
  (:require [clojure.test :as t]
            [ex.q085 :as sut]))

(t/deftest test-q85
  (t/testing "Problem 85, Power Set"
    (t/is (= #{#{1 :a} #{:a} #{} #{1}} (sut/ans #{1 :a})))
    (t/is (= #{#{}} (sut/ans #{})))
    (t/is (= #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}} (sut/ans #{1 2 3})))
    (t/is (= 1024 (count (sut/ans (into #{} (range 10))))))))