;; https://4clojure.oxal.org/#/problem/055
 
(ns ex.q055)

(defn ans
  "Problem 55, Count Occurences. special restrictions: frequencies"
  [coll]
  (let [grouped (group-by identity coll)]
    (zipmap (keys grouped) (map count (vals grouped)))))