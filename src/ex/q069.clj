;; https://4clojure.oxal.org/#/problem/069
 
(ns ex.q069)

(defn ans
  "Problem 69, Merge with a Function. (restriction: merge-with)"
  [f m1 & maps]
  (letfn [(combine
            [m1 m2]
            (reduce (fn [m [k v2]]
                      (if-let [v1 (get m k)]
                        (assoc m k (f v1 v2))
                        (assoc m k v2)))
                    m1 m2))]
    (reduce combine m1 maps)))