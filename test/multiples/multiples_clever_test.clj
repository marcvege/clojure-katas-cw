(ns multiples.multiples-clever-test
    (:require [clojure.test :refer :all]
    [multiples.multiples-clever :refer [solution_clever]]))

(deftest test-multiples-of-3-and-5
    (is (= 23 (solution_clever 10))))

(deftest test-multiples-of-3-and-5
    (is (= 0 (solution_clever 0))))

(deftest test-multiples-of-3-and-5
    (is (= 0 (solution_clever 1))))

(deftest test-multiples-of-3-and-5
    (is (= 0 (solution_clever 2))))

(deftest test-multiples-of-3-and-5
    (is (= 0 (solution_clever 3))))

(deftest test-multiples-of-3-and-5
    (is (= 3 (solution_clever 4))))

(deftest test-multiples-of-3-and-5
    (is (= 3 (solution_clever 5))))

(deftest test-multiples-of-3-and-5
    (is (= 8 (solution_clever 6))))