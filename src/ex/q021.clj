;; https://4clojure.oxal.org/#/problem/021
 
(ns ex.q021)

(defn ans
  "Problem 21, Nth Element. restriction: nth"
  [coll index]
  (.get coll index))

(defn ans2
  "another take, using `drop`"
  [coll index]
  (->> coll (drop index) first))