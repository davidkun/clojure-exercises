;; https://4clojure.oxal.org/#/problem/054
 
(ns ex.q054)

(defn ans
  "Problem 54, Partition a Sequence. restrictions: partition,partition-all"
  [n coll]
  (loop [src coll dest []]
    (let [[head tail] (split-at n src)]
      (if (= n (count head))
        (recur tail (conj dest head))
        dest))))