;; https://4clojure.oxal.org/#/problem/031
 
(ns ex.q031)

(defn ans
  "Problem 31, Pack a Sequence. (pack consecutive duplicates into sub-lists)"
  [coll]
  (partition-by identity coll))