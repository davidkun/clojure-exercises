;; https://4clojure.oxal.org/#/problem/085

(ns ex.q085)

(defn ans
  "Problem 85, Power Set"
  [is]
  (letfn [(subsets [coll i] (reduce #(conj %1 (conj %2 i)) coll coll))]
    (reduce subsets #{#{}} is)))