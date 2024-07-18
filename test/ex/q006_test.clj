;; https://4clojure.oxal.org/#/problem/6

(ns ex.q006-test
  (:require [clojure.test :as t]
            [ex.q006 :as sut]))

(t/deftest test=q6
  (t/testing "Problem 6, vectors"
    (t/is (= (list :a :b :c) (sut/ans)))
    (t/is (= (vec '(:a :b :c)) (sut/ans)))
    (t/is (= (vector :a :b :c) (sut/ans)))))