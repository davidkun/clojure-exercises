;; https://4clojure.oxal.org/#/problem/056
 
(ns ex.q056)

(defn ans
  "Problem 56, Find Distinct Items. restrictions: distinct"
  [coll]
  (let [seen (atom #{})]
    (into [] (filter #(if (contains? @seen %) false (do (swap! seen conj %) true)) coll))))