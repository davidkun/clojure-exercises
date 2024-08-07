;; https://4clojure.oxal.org/#/problem/040
 
(ns ex.q040-test
  (:require [clojure.test :as t]
            [ex.q040 :as sut]))

(t/deftest test-q40
  (t/testing "Problem 40, Interpose a Seq"
    (t/is (= [1 0 2 0 3] (sut/ans 0 [1 2 3])))
    (t/is (= "one, two, three" (apply str (sut/ans ", " ["one" "two" "three"]))))
    (t/is (= [:a :z :b :z :c :z :d] (sut/ans :z [:a :b :c :d])))))