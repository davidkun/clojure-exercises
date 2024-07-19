;; https://4clojure.oxal.org/#/problem/008
 
(ns ex.q008-test
  (:require [clojure.set]
            [clojure.test :as t]
            [ex.q008 :as sut]))

(t/deftest test-q8
  (t/testing "Problem 8, Sets"
    (t/is (= (set '(:a :a :b :c :c :c :c :d :d)) (sut/ans)))
    (t/is (= (clojure.set/union #{:a :b :c} #{:b :c :d}) (sut/ans)))))
