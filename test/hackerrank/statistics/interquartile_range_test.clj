(ns hackerrank.statistics.interquartile-range-test
  (:require [clojure.test :refer :all]
            [clojure.string :as string]
            [hackerrank.statistics.interquartile-range :refer :all]))

(deftest interquartile-range-test
  (let [N 6
        X [6 12 8 10 20 16]
        F [5 4 3 2 1 5]]
    (is (= 9 (interquartile-range (frequencies->list X F)))))
  (let [N 20
        X [10 40 30 50 20 10 40 30 50 20 1  2  3  4  5  6  7  8  9  10]
        F [1  2  3  4  5  6  7  8  9  10 10 40 30 50 20 10 40 30 50 20]]
    (is (= 5.0 (double (interquartile-range (frequencies->list X F)))))))
