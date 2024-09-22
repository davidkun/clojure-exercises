;; https://4clojure.oxal.org/#/problem/077
 
(ns ex.q077)

(defn ans
  "Problem 77, Anagram Finder"
  [coll]
  (letfn [(hash-word [w] (->> w sort (apply str) hash))]
    (set
     (filter #(> (count %) 1)
             (map set (vals (group-by hash-word coll)))))))