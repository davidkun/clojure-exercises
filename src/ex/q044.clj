;; https://4clojure.oxal.org/#/problem/044
 
(ns ex.q044)

(defn ans
  "Problem 44, Rotate Sequence"
  [x coll]
  (let [len (count coll),
        n (mod x len)]
    (concat (drop n coll) (take n coll))))