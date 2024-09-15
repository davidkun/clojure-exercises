;; https://4clojure.oxal.org/#/problem/069
 
(ns ex.q069-test
  (:require [clojure.test :as t]
            [ex.q069 :as sut]))

(t/deftest test-q69
  (t/testing "Problem 69, Merge with a Function"
    (t/is (= {:a 4, :b 6, :c 20}
             (sut/ans * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})))
    ;; (t/is (= {1 7, 2 10, 3 15}
    ;;          (sut/ans - {1 10, 2 20} {1 3, 2 10, 3 15})))
    ;; (t/is (= {:a [3 4 5], :b [6 7], :c [8 9]}
    ;;          (sut/ans concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})))
    ))