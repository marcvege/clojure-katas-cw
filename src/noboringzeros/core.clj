; https://www.codewars.com/kata/no-zeros-for-heros/train/clojure
(ns noboringzeros.core)

(defn no-boring-zeros
  "Remove right zeros."
  [number]
  (if (= 0 number)
    0
    (read-string (clojure.string/replace (str number) #"0+$" ""))))



