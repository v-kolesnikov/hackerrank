; https://www.hackerrank.com/challenges/s10-mcq-4/problem

(ns hackerrank.statistics.conditional-probability)

(def probability-of-two-boys-after-one
  (let [events [:boy :girl]
        sample-space (filter #(some #{:boy} %)
                             (for [x events
                                   y events]
                               [x y]))
        favorable-outcomes (filter (fn [xs] (= [:boy :boy] xs))
                                   sample-space)]
    (/ (count favorable-outcomes)
       (count sample-space))))
