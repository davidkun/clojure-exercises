;; https://4clojure.oxal.org/#/problem/051
 
(ns ex.q051)

(defn ans
  "Problem 51, Advanced Destructuring"
  []
  (let [[a b & c :as d] [1 2 3 4 5]]
    [a b c d]))