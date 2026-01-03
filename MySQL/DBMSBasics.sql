-- Create a new database
CREATE DATABASE pokemon_db;

-- Select the database to use
USE pokemon_db;

-- Create pokemon table with constraints
CREATE TABLE pokemon (
    pokemon_id INT AUTO_INCREMENT,       -- Auto increment primary key
    name VARCHAR(50) NOT NULL,            -- Name cannot be NULL
    type VARCHAR(20),                     -- Pokemon type
    attack INT CHECK (attack >= 0),       -- Check constraint
    defense INT CHECK (defense >= 0),
    hp INT CHECK (hp > 0),
    PRIMARY KEY (pokemon_id),             -- Primary key
    UNIQUE (name)                         -- Unique constraint
);

CREATE INDEX idx_pokemon_type
ON pokemon(pokemon_type);

-- Create trainer table
CREATE TABLE trainer (
    trainer_id INT AUTO_INCREMENT PRIMARY KEY,
    trainer_name VARCHAR(50) NOT NULL,
    region VARCHAR(30)
);

-- Bridge table for many-to-many relationship
CREATE TABLE trainer_pokemon (
    trainer_id INT,
    pokemon_id INT,
    level INT DEFAULT 1,                  -- Default value
    PRIMARY KEY (trainer_id, pokemon_id),
    FOREIGN KEY (trainer_id) REFERENCES trainer(trainer_id),
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(pokemon_id)
);

-- Insert data into pokemon table
INSERT INTO pokemon (name, type, attack, defense, hp) VALUES
('Pikachu', 'Electric', 55, 40, 35),
('Charizard', 'Fire', 84, 78, 78),
('Bulbasaur', 'Grass', 49, 49, 45),
('Gengar', 'Ghost', 65, 60, 60);

-- More insert data
INSERT INTO pokemon (name, type, attack, defense, hp) VALUES
('Blastoise', 'Water', 83, 100, 79),
('Venusaur', 'Grass', 82, 83, 80),
('Snorlax', 'Normal', 110, 65, 160),
('Greninja', 'Water', 95, 67, 72),
('Infernape', 'Fire', 104, 71, 76),
('Tyranitar', 'Rock', 134, 110, 100),
('Garchomp', 'Dragon', 130, 95, 108),
('Espeon', 'Psychic', 65, 60, 65);

-- Insert trainers
INSERT INTO trainer (trainer_name, region) VALUES
('Yash', 'Mumbai'),
('Soham', 'Mumbai'),
('Deepam', 'Gujrat'),
('Sidhu', 'Punjab');

-- Insert relationship data
INSERT INTO trainer_pokemon (trainer_id, pokemon_id, level) VALUES
(1, 1, 25),
(1, 2, 36),
(1, 4, 30),
(2, 3, 20),
(2, 5, 40),
(2, 8, 45),
(3, 6, 38),
(3, 7, 50),
(3, 12, 42),
(4, 9, 47),
(4, 10, 60),
(4, 11, 58);

-- Select all records
SELECT * FROM pokemon;

-- DISTINCT keyword
SELECT DISTINCT type FROM pokemon;

-- WHERE condition
SELECT * FROM pokemon 
WHERE attack > 90;

-- AND / OR
SELECT name FROM pokemon
WHERE type = 'Fire' OR type = 'Electric';

-- ORDER BY and LIMIT
SELECT name, attack FROM pokemon
ORDER BY attack DESC
LIMIT 5;

-- LIKE wildcard
SELECT name FROM pokemon
WHERE name LIKE '%saur%';

-- IN keyword
SELECT name FROM pokemon
WHERE type IN ('Fire', 'Ghost');

-- Alias
SELECT name AS pokemon_name, attack AS atk
FROM pokemon;

-- BETWEEN
SELECT * FROM pokemon
WHERE attack BETWEEN 50 AND 80;

-- UPDATE query
UPDATE pokemon
SET attack = 90
WHERE name = 'Charizard';

-- DELETE query
DELETE FROM pokemon
WHERE name = 'Bulbasaur';

-- INNER JOIN
SELECT t.trainer_name, p.name AS pokemon
FROM trainer t
INNER JOIN trainer_pokemon tp ON t.trainer_id = tp.trainer_id
INNER JOIN pokemon p ON p.pokemon_id = tp.pokemon_id;

-- LEFT JOIN
SELECT *
FROM trainer t
LEFT JOIN trainer_pokemon tp ON t.trainer_id = tp.trainer_id
LEFT JOIN pokemon p ON p.pokemon_id = tp.pokemon_id;

-- RIGHT JOIN
SELECT t.trainer_name, p.name
FROM trainer t
RIGHT JOIN trainer_pokemon tp ON t.trainer_id = tp.trainer_id
RIGHT JOIN pokemon p ON tp.pokemon_id = p.pokemon_id;

-- FULL JOIN
SELECT * FROM trainer t
LEFT JOIN trainer_pokemon tp ON t.trainer_id = tp.trainer_id
UNION
SELECT * FROM trainer t
RIGHT JOIN trainer_pokemon tp ON t.trainer_id = tp.trainer_id;


-- UNION
SELECT name FROM pokemon WHERE type = 'Fire'
UNION
SELECT name FROM pokemon WHERE type = 'Electric';

-- Create new table
CREATE TABLE strong_pokemon (
    name VARCHAR(50),
    defense INT
);

-- Remove all rows
TRUNCATE strong_pokemon;

-- INSERT INTO SELECT
INSERT INTO strong_pokemon
SELECT name, defense
FROM pokemon
WHERE defense > 50;

-- ALTER TABLE
ALTER TABLE pokemon ADD speed INT DEFAULT 50;

-- Rename column
ALTER TABLE pokemon CHANGE type pokemon_type VARCHAR(20);

-- Create VIEW
CREATE VIEW fire_pokemon AS
SELECT name, attack, hp
FROM pokemon
WHERE pokemon_type = 'Fire';

-- Use VIEW
SELECT * FROM fire_pokemon;

-- GROUP BY
SELECT pokemon_type, AVG(attack) AS avg_attack
FROM pokemon
GROUP BY pokemon_type;

-- Aggregate functions
SELECT 
COUNT(*) AS total_pokemon,
MAX(attack) AS max_attack,
MIN(hp) AS min_hp,
AVG(defense) AS avg_defense
FROM pokemon;

-- HAVING clause
SELECT pokemon_type, AVG(attack) AS avg_attack
FROM pokemon
GROUP BY pokemon_type
HAVING AVG(attack) > 60;

-- PREPARED STATEMENT
PREPARE stmt FROM
'SELECT * FROM pokemon WHERE attack > ?';
SET @atk = 80;
EXECUTE stmt USING @atk;
DEALLOCATE PREPARE stmt;

DELIMITER $$

CREATE PROCEDURE GetPokemonByTrainer(IN t_name VARCHAR(50))
BEGIN
    SELECT 
        t.trainer_name,
        p.name AS pokemon_name,
        p.pokemon_type,
        tp.level
    FROM trainer t
    INNER JOIN trainer_pokemon tp 
        ON t.trainer_id = tp.trainer_id
    INNER JOIN pokemon p 
        ON p.pokemon_id = tp.pokemon_id
    WHERE t.trainer_name = t_name;
END $$

DELIMITER ;

-- Call procedure
CALL GetPokemonByTrainer('Yash');
CALL GetPokemonByTrainer('Soham');

Select * from pokemon;
