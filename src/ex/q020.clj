;; https://4clojure.oxal.org/#/problem/020
 
(ns ex.q020)

(defn ans
  "Problem 20, Penultimate Element"
  [coll]
  (-> coll reverse second))