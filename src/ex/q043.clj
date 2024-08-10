;; https://4clojure.oxal.org/#/problem/043
 
(ns ex.q043)

(defn ans
  "Problem 43, Reverse Interleave"
  [coll n]
  (apply map vector (partition-all n coll)))