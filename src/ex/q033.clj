;; https://4clojure.oxal.org/#/problem/033
 
(ns ex.q033)

(defn ans
  "Problem 33, Replicate a Sequence"
  [coll n]
  (reduce #(into %1 (repeat n %2)) [] coll))