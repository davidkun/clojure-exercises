;; https://4clojure.oxal.org/#/problem/050
 
(ns ex.q050)

(defn ans
  "Problem 50, Split by Type"
  [coll]
  (vals (group-by type coll)))