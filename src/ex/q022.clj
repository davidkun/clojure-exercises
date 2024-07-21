;; https://4clojure.oxal.org/#/problem/022
 
(ns ex.q022)

(defn ans
  "Problem 22, Count a Sequence. restriction: count"
  [coll]
  (loop [cnt 0 col coll]
    (if (empty? col)
      cnt
      (recur (inc cnt) (rest col)))))