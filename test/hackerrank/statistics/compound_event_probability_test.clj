(ns hackerrank.statistics.compound-event-probability-test
  (:require [clojure.test :refer :all]
            [hackerrank.statistics.compound-event-probability :refer :all]))

(deftest compound-probability-test
  (is (= 17/42 (compound-probability [4 3] [5 4] [4 4]))))
