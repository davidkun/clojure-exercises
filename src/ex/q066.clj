;; https://4clojure.oxal.org/#/problem/066
 
(ns ex.q066)

(defn ans
  "Problem 66, Greatest Common Divisor"
  [x y]
  (some #(when (= 0 (rem x %) (rem y %)) %) (range (min x y) 0 -1)))
