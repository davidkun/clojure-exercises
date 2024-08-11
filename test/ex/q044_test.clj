;; https://4clojure.oxal.org/#/problem/044
 
(ns ex.q044-test
  (:require [clojure.test :as t]
            [ex.q044 :as sut]))

(t/deftest test-q44
  (t/testing "Problem 44, Rotate Sequence"
    (t/is (= '(3 4 5 1 2) (sut/ans 2 [1 2 3 4 5])))
    (t/is (= '(4 5 1 2 3) (sut/ans -2 [1 2 3 4 5])))
    (t/is (= '(2 3 4 5 1) (sut/ans 6 [1 2 3 4 5])))
    (t/is (= '(:b :c :a) (sut/ans 1 '(:a :b :c))))
    (t/is (= '(:c :a :b) (sut/ans -4 '(:a :b :c))))))