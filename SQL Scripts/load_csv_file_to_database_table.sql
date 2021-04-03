-- uses IMDB database 
USE IMDB;

-- loads actor csv file into actor table 
LOAD DATA INFILE '/Data CSV/actor.csv'
INTO TABLE Actor
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

-- loads actress csv file into actress table 
LOAD DATA INFILE '/Data CSV/actress.csv'
INTO TABLE Actress
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

-- loads genre csv file into genre table 
LOAD DATA INFILE '/Data CSV/genre.csv'
INTO TABLE Genre
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

-- loads movie csv into movie table 
LOAD DATA INFILE '/Data CSV/movie.csv'
INTO TABLE Movie
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

-- loads rating csv file into rating table 
LOAD DATA INFILE '/Data CSV/rating.csv'
INTO TABLE Rating
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;