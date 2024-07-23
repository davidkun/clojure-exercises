;; https://4clojure.oxal.org/#/problem/024
 
(ns ex.q024)

(defn ans
  "Problem 24, Sum It All Up"
  [coll]
  (reduce + 0 coll))