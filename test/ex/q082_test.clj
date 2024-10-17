;; https://4clojure.oxal.org/#/problem/082
 
(ns ex.q082-test
  (:require [clojure.test :as t]
            [ex.q082 :as sut]))

(t/deftest test-q82
  (t/testing "Problem 82, Word Chains"
    (t/is (= true (sut/ans #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})))
    (t/is (= false (sut/ans #{"cot" "hot" "bat" "fat"})))
    (t/is (= false (sut/ans #{"to" "top" "stop" "tops" "toss"})))
    (t/is (= true (sut/ans #{"spout" "do" "pot" "pout" "spot" "dot"})))
    (t/is (= true (sut/ans #{"share" "hares" "shares" "hare" "are"})))
    (t/is (= false (sut/ans #{"share" "hares" "hare" "are"})))))