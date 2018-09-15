(ns hackerrank.statistics.basic-probability)

; Task: https://www.hackerrank.com/challenges/s10-mcq-1/problem
; In a single toss of 2 fair (evenly-weighted) six-sided dice, find the
; probability that their sum will be at most 9.
(defn probability-of-sum-at-most
  [max-sum]
  (let [invariants [1 2 3 4 5 6]
        sample-space (for [x1 invariants
                           x2 invariants]
                       [x1 x2])
        favorable-outcomes (filter (fn [[x1 x2]]
                                     (<= (+ x1 x2) max-sum))
                                   sample-space)]
    (/ (count favorable-outcomes)
       (count sample-space))))

; Task: https://www.hackerrank.com/challenges/s10-mcq-2/problem
; In a single toss of 2 fair (evenly-weighted) six-sided dice, find the
; probability that the values rolled by each die will be different and the two
; dice have a sum of 6.
(defn probability-of-difference-with-sum
  [sum]
  (let [invariants [1 2 3 4 5 6]
        sample-space  (for [x1 invariants
                            x2 invariants]
                        [x1 x2])
        favorable-outcomes (filter (fn [[x1 x2]]
                                     (and (not= x1 x2)
                                          (= (+ x1 x2) sum)))
                                   sample-space)]
    (/ (count favorable-outcomes)
       (count sample-space))))
