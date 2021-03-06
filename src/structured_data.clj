(ns structured-data)

(defn do-a-thing [x]
  (let [numero (+ x x)]
  (Math/pow numero numero)))

(defn spiff [v]
  (+ (get v 0) (get v 2)))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
  (let [[x y z] v]
  (+ x z)
  ))



(defn point [x y]
 [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- x2 x1)
    ))

(defn height [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- y2 y1)
    ))

(defn square? [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (if (== (- x2 x1) (- y2 y1)) true false))
  )

;(defn area [rectangle]
; (let [[[x1 y1] [x2 y2]] rectangle]
;    (* (- x2 x1) (- y2 y1)))
;  )

  (defn area [rec]
        (* ((height (rec))) ((width (rec))))
  )


(defn contains-point? [recta poi]
  (let [[[x1 y1] [x2 y2]] recta
        x3 (get poi 0)
        y3 (get poi 1)]
   (if(and (<= x1 x3 x2) (<= y1 y3 y2)) true false)
  ))



(defn contains-rectangle? [outer inner]
  (let [[[x1 y1] [x2 y2]] outer
        [[xx1 yy1] [xx2 yy2]] inner
        ]
        (if(and (contains-point? (rectangle [x1 y1] [x2 y2]) (point xx1 yy1)) (contains-point? (rectangle [x1 y1] [x2 y2]) (point xx2 yy2))) true false)
  ))


(defn title-length [book]
  (count (get book :title))
  )

(defn author-count [book]
  (count (get book :authors))
  )

(defn multiple-authors? [book]
  (if (< 1 (count (get book :authors))) true false)
  )


(defn add-author [book new-author]
  (let [auts (get book :authors)
        new_auts (conj auts new-author)
        ]

  (assoc book :authors new_auts)
   ))


(defn alive? [author]
  (if (contains? author :death-year) false true)
    )

(defn element-lengths [collection]
  (map count collection)
  )

(defn second-elements [collection]
  (let [getsecond (fn[x] (get x 1))]
  (map getsecond collection)
  ))

(defn titles [books]
  (map :title books)
  )

(defn monotonic? [a-seq]
  :-)


(defn stars [n]
  (apply str (repeat n (str \*))
  )
)

(stars 3)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
