;; https://4clojure.oxal.org/#/problem/078
 
(ns ex.q078-test
  (:require [clojure.test :as t]
            [ex.q078 :as sut]))

(t/deftest test-q78
  (t/testing "Problem 78, Reimplement Trampoline"
    (t/is (= 82
             (letfn [(triple [x] #(sub-two (* 3 x)))
                     (sub-two [x] #(stop? (- x 2)))
                     (stop? [x] (if (> x 50) x #(triple x)))]
               (sut/ans triple 2))))
    (t/is (= [true false true false true false]
             (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
                     (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
               (map (partial sut/ans my-even?) (range 6)))))))