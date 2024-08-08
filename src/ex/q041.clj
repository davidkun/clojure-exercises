;; https://4clojure.oxal.org/#/problem/041
 
(ns ex.q041)

(defn ans
  "Problem 41, Drop Every Nth Item"
  [coll n]
  (mapcat #(if (= n (count %)) (butlast %) %) (partition-all n coll)))