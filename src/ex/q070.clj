;; https://4clojure.oxal.org/#/problem/070
 
(ns ex.q070)

(defn ans
  "Problem 70, Word Sorting"
  [sentence]
  (sort-by #(.toLowerCase %) (re-seq #"\w+" sentence)))