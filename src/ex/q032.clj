;; https://4clojure.oxal.org/#/problem/032
 
(ns ex.q032)

(defn ans
  "Problem 32, Duplicate a Sequence. (duplicate each element of a sequence)"
  [coll]
  (reduce #(conj %1 %2 %2) [] coll))