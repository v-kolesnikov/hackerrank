(ns hackerrank.statistics.basic-test
  (:require [clojure.test :refer :all]
            [hackerrank.statistics.basic :refer :all]))

(deftest basic
  (let [N 10
        X [64630 11735 14216 99233 14470 4978 73429 38120 51135 67060]]
    (is (= 43900.6 (double (mean X N))))
    (is (= 44627.5 (double (median X N))))
    (is (= 4978 (mode X)))))
