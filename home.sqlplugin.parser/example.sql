SELECT t.col1, t.col2
FROM
  (SELECT p.col1, p.col2
    FROM
      (SELECT k.col1, k.col2, k.col3
        FROM
        public.some_table k
      ) p
  ) t;