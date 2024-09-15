;; https://4clojure.oxal.org/#/problem/072
 
(ns ex.q072)

(defn ans
  "Problem 72, Rearranging Code: ->>"
  []
  (->> [2 5 4 1 3 6]
       (drop 2)
       (take 3)
       (map inc)
       (apply +)))