INSERT INTO task (title) 
SELECT 'StringReverse' WHERE NOT EXISTS (SELECT 1 FROM task WHERE title = 'StringReverse');

INSERT INTO task (title) 
SELECT 'StringReverse2' WHERE NOT EXISTS (SELECT 1 FROM task WHERE title = 'StringReverse2');

INSERT INTO http (code, status) 
SELECT 1, 'Info' WHERE NOT EXISTS (SELECT 1 FROM http WHERE code = 1);

INSERT INTO http (code, status) 
SELECT 100, 'Continue' WHERE NOT EXISTS (SELECT 1 FROM http WHERE code = 100);

INSERT INTO http (code, status) 
SELECT 101, 'Switching protocols' WHERE NOT EXISTS (SELECT 1 FROM http WHERE code = 101);

INSERT INTO http (code, status) 
SELECT 102, 'Processing' WHERE NOT EXISTS (SELECT 1 FROM http WHERE code = 102);

INSERT INTO http (code, status) 
SELECT 103, 'Early Hints, headers' WHERE NOT EXISTS (SELECT 1 FROM http WHERE code = 103);

INSERT INTO http (code, status) 
SELECT 200, 'Ok' WHERE NOT EXISTS (SELECT 1 FROM http WHERE code = 200);

