;; https://4clojure.oxal.org/#/problem/059
 
(ns ex.q059)

(defn ans
  "Problem 59, Juxtaposition. restrictions: juxt"
  ([& fns] (fn [& xs] (into [] (map #(apply % xs) fns)))))