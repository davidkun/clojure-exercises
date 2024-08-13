;; https://4clojure.oxal.org/#/problem/046
 
(ns ex.q046)

(defn ans
  "Problem 46, Flipping out"
  [f]
  (fn [a b] (f b a)))