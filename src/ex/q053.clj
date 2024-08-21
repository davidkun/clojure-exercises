;; https://4clojure.oxal.org/#/problem/053
 
(ns ex.q053)

(defn ans
  "Problem 53, Longest Increasing Sub-Seq"
  [coll]
  (->> coll
       (partition 2 1) ;; create overlapping pairs
       (partition-by #(= (inc (first %)) (second %))) ;; partition by increasing pairs
       (filter #(= (inc (ffirst %)) (second (first %)))) ;; drop violations
       (sort-by count)
       last ;; grab longest sequence
       (reduce concat)
       dedupe)) ;; remove overlapping elements