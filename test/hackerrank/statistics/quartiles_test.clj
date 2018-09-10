(ns hackerrank.statistics.quartiles-test
  (:require [clojure.test :refer :all]
            [hackerrank.statistics.quartiles :refer :all]))

(deftest quartiles-test
  (let [N 9
        X [3 7 8 5 12 14 21 13 18]]
    (is (= [6 12 16] (quartiles X N)))))
