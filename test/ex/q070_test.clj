;; https://4clojure.oxal.org/#/problem/070
 
(ns ex.q070-test
  (:require [clojure.test :as t]
            [ex.q070 :as sut]))

(t/deftest test-q70
  (t/testing "Problem 70, Word Sorting"
    (t/is (= ["a" "day" "Have" "nice"]
             (sut/ans "Have a nice day.")))
    (t/is (= ["a" "Clojure" "fun" "is" "language"]
             (sut/ans "Clojure is a fun language!")))
    (t/is (= ["fall" "follies" "foolish" "Fools" "for"]
             (sut/ans "Fools fall for foolish follies.")))))