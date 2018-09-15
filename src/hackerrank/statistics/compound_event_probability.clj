(ns hackerrank.statistics.compound-event-probability)

; x, y, z - are vectors of two elements [red-balls-count black-balls-count]
(defn compound-probability
  [x y z]
  (let [px (/ (first x) (reduce + x))
        py (/ (first y) (reduce + y))
        pz (/ (first z) (reduce + z))]
    (+ (* px py (- 1 pz))
       (* px pz (- 1 py))
       (* py pz (- 1 px)))))
