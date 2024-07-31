;; https://4clojure.oxal.org/#/problem/030
 
(ns ex.q030)

(defn ans
  "Problem 30, Compress a Sequence. (remove consecutive duplicates from a sequence)"
  [coll]
  (reduce #(if (= (last %1) %2) %1 (conj %1 %2)) [] coll))