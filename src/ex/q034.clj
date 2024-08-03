;; https://4clojure.oxal.org/#/problem/034
 
(ns ex.q034)

(defn ans
  "Problem 34, Implement range. (restriction: range)"
  [start end]
  (loop [ret [start] j (inc start)]
    (if (>= j end)
      ret
      (recur (conj ret j) (inc j)))))