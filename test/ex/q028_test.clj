;; https://4clojure.oxal.org/#/problem/028
 
(ns ex.q028-test
  (:require [clojure.test :as t]
            [ex.q028 :as sut]))

(t/deftest test-q28
  (t/testing "Problem 28, Flatten a Sequence"
    (t/is (= '(1 2 3 4 5 6) (sut/ans '((1 2) 3 [4 [5 6]]))))
    (t/is (= '("a" "b" "c") (sut/ans ["a" ["b"] "c"])))
    (t/is (= '(:a) (sut/ans '((((:a)))))))))