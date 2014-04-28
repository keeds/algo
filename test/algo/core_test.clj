(ns algo.core-test
  (:require
   [midje.sweet :refer :all]
   [algo.core :refer :all]))


(fact (sortie [5 4 1 8 7 2 6 3]) => [1 2 3 4 5 6 7 8])
