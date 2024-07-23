;; https://4clojure.oxal.org/#/problem/025
 
(ns ex.q025)

(defn ans 
  "Problem 25, Find the odd numbers"
  [coll]
  (filter odd? coll))