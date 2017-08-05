;https://www.codewars.com/kata/multiples-of-3-and-5/train/clojure
(ns multiples.multiples)

(defn isMultiOf? [number div]
  (== 0 (mod number div)))

(defn multiples-of-3-and-5-of [number]
  (cond
    (< number 1) ()
    :else (cond
            (isMultiOf? number 3)
              (concat (list number) (multiples-of-3-and-5-of (- number 1)))
            (isMultiOf? number 5)
              (concat (list number) (multiples-of-3-and-5-of (- number 1)))
            :else
              (multiples-of-3-and-5-of (- number 1))
            )
    )
  )

(defn solution [number]
    (apply + (multiples-of-3-and-5-of (- number 1)))
  )