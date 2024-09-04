;; https://4clojure.oxal.org/#/problem/063
 
(ns ex.q063)

(defn ans
  "Problem 63, Group a Sequence. restriction: group-by"
  [fn coll]
  (apply merge-with into (map #(hash-map (fn %) [%]) coll)))