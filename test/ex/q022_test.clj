;; https://4clojure.oxal.org/#/problem/022
 
(ns ex.q022-test
  (:require [clojure.test :as t]
            [ex.q022 :as sut]))

(t/deftest test-q22
  (t/testing "Problem 22, Count a Sequence"
    (t/is (= 5 (sut/ans '(1 2 3 3 1))))
    (t/is (= 11 (sut/ans "Hello World")))
    (t/is (= 3 (sut/ans [[1 2] [3 4] [5 6]])))
    (t/is (= 1 (sut/ans '(13))))
    (t/is (= 3 (sut/ans '(:a :b :c))))))