;; https://4clojure.oxal.org/#/problem/065
 
(ns ex.q065)

(defn ans
  "Problem 65, Black Box Testing"
  [coll]
  (cond
    (= :kun (:david (conj coll [:david :kun]))) :map
    (= (inc (count coll)) (count (conj coll [:david :kun] [:david :kun]))) :set
    (= :kun (first (conj coll :david :kun))) :list
    (= :kun (last (conj coll :david :kun))) :vector
    :else :unknown))