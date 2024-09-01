;; https://4clojure.oxal.org/#/problem/061
 
(ns ex.q061)

(defn ans
  "Problem 61, Map Construction. restriction: zipmap"
  [k v]
  (into {} (map #(vector %1 %2) k v)))