;; https://4clojure.oxal.org/#/problem/081
 
(ns ex.q081)

(defn ans
  "Problem 81, Set Intersection"
  [a b]
  (let [union (apply conj a b)]
    (->> union
         (filter #(and (contains? a %) (contains? b %)))
         set)))