(ns hackerrank.statistics.standard-deviation-test
  (:require [clojure.test :refer :all]
            [hackerrank.statistics.standard-deviation :refer :all]))

(deftest standard-deviation-test
  (let [N 5
        X [10 40 30 50 20]]
    (is (= 14.142135623730951 (standard-deviation X N)))))
