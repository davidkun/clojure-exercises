;; https://4clojure.oxal.org/#/problem/073
 
(ns ex.q073)

(defn ans
  "Problem 73, Analyze a Tic-Tac-Toe Board"
  [board]
  (letfn [(win? [coll] (if (and (apply = coll) (not= (first coll) :e)) (first coll) nil))
          (transpose [coll] (apply map vector coll))
          (diag [coll i] (map (fn [[idx row]] (row idx)) (zipmap i coll)))]
    (first (drop-while nil?
                       (lazy-cat
                        (map win? board)
                        (map win? (transpose board))
                        (map win? [(diag board [0 1 2]) (diag board [2 1 0])]))))))