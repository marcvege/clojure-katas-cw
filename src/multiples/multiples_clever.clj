(ns multiples.multiples-clever)

(defn solution_clever [number]
  (->> number
       (range)
       (rest)
       (filter #(or (zero? (mod % 3)) (zero? (mod % 5))))
       (apply +))
  )
