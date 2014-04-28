(ns algo.core)


(defn merge-sort [left right]
  (loop [l left
         r right
         result []]
    (println "ms:" l r result)
    (if (and (empty? l)
          (empty? r))
      result
      (let [lhead (first l)
            rhead (first r)]
        (cond
          (nil? lhead) (concat result r)
          (nil? rhead) (concat result l)
          (<= lhead rhead) (recur (rest l) r (conj result lhead))
          :else            (recur l (rest r) (conj result rhead)))))))

(defn sortie [xs]
  (if (<= (count xs) 1)
    xs
    (let [l (/ (count xs) 2)
          [left right] (split-at l xs)]
      (merge-sort
        (sortie left)
        (sortie right)))))
