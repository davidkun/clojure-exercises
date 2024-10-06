;; https://4clojure.oxal.org/#/problem/081
 
(ns ex.q081-test
  (:require [clojure.test :as t]
            [ex.q081 :as sut]))

(t/deftest test-q81
  (t/testing "Problem 81, Set Intersection"
    (t/is (= #{2 3} (sut/ans #{0 1 2 3} #{2 3 4 5})))
    (t/is (= #{} (sut/ans #{0 1 2} #{3 4 5})))
    (t/is (= #{:a :c :d} (sut/ans #{:a :b :c :d} #{:c :e :a :f :d})))))