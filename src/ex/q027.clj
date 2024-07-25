;; https://4clojure.oxal.org/#/problem/027
 
(ns ex.q027)

(defn ans 
  "Problem 27, Palindrome Detector"
  [coll]
  (= (seq coll) (reverse coll))) ;; O(n) time, but concise