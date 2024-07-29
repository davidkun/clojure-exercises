;; https://4clojure.oxal.org/#/problem/029
 
(ns ex.q029)

(defn ans
  "Problem 29, Get the Caps. (return a new string containing only the capital letters)"
  [s]
  (let [caps (set "ABCDEFGHIJKLMNOPQRSTUVWXYZ")]
    (apply str (filter #(contains? caps %) s))))