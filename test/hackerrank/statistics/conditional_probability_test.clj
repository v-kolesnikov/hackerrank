(ns hackerrank.statistics.conditional-probability-test
  (:require [clojure.test :refer :all]
            [hackerrank.statistics.conditional-probability :refer :all]))

(deftest probability-of-two-boys-after-one-test
  (is (= 1/3 probability-of-two-boys-after-one)))
