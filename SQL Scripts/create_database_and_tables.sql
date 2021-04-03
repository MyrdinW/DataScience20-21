-- database maken
CREATE DATABASE IMDB;

-- Gebruik imdb database 
USE IMDB;

-- tabel maken voor actors
CREATE TABLE Actor(
Actor varchar(255) NOT NULL,
Title varchar(255) NOT NULL,
Year int(5) NULL 
);

-- tabel maken voor acctress
CREATE TABLE Actress(
Actress varchar(255) NOT NULL,
Title varchar(255) NOT NULL,
Year int(5) NULL 
);

-- tabel maken voor genres
CREATE TABLE Genre(
Title varchar(255) NOT NULL,
Year int(5) NULL,
Genre varchar(255) NOT NULL
 );
 
--  tabel maken voor movies
CREATE TABLE Movie(
Title varchar(255) NOT NULL,
Year int(5) NULL
 );

-- table maken voor ratings
CREATE TABLE Rating(
Votes int(25) NULL,
Rating double NOT NULL,
Title varchar(255) NOT NULL,
Year int(5) NULL
 );