;; https://4clojure.oxal.org/#/problem/009
 
(ns ex.q009-test
  (:require [clojure.test :as t]
            [ex.q009 :as sut]))

(t/deftest test-q9
  (t/testing "Problem 9, conj on sets"
    (t/is (= #{1 2 3 4} (sut/ans)))))