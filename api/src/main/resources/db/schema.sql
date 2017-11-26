DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info(id INT PRIMARY KEY, name VARCHAR(255));
INSERT INTO user_info VALUES(1, 'Hello');
INSERT INTO user_info VALUES(2, 'World');
SELECT * FROM user_info ORDER BY id;
UPDATE user_info SET NAME='Hi' WHERE id=1;
DELETE FROM user_info WHERE id=2;