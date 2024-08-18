;; https://4clojure.oxal.org/#/problem/052
 
(ns ex.q052)

(defn ans
  "Problem 52, Intro to Destructuring"
  []
  (let [[_ _ c _ e _ _] (range)] [c e]))