;; https://4clojure.oxal.org/#/problem/049
 
(ns ex.q049)

(defn ans
  "Problem 49, Split a sequence. restriction: split-at"
  [n coll]
  [(take n coll) (drop n coll)])