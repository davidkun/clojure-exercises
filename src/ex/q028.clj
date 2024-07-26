;; https://4clojure.oxal.org/#/problem/028
 
(ns ex.q028)

(defn ans
  "Problem 28, Flatten a Sequence, restriction: flatten"
  [coll]
  (if (empty? coll)
    '()
    (let [head (first coll) tail (rest coll)]
      (if (coll? head)
        (concat (ans head) (ans tail))
        (concat [head] (ans tail))))))