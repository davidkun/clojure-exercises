;; https://4clojure.oxal.org/#/problem/083
 
(ns ex.q083)

(defn ans
  "Problem 83, A Half-Truth"
  [& bools]
  (boolean (and (some true? bools) (not-every? true? bools))))