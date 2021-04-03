library(ggplot2)
library(dplyr)

rating <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/rating.csv")
actor <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/actor.csv")
actress <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/actress.csv")
genre <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/genre.csv")
movie <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/movie.csv")

rating2 <- select(rating, Votes, Rating)
rating2

science_fiction_movies <- filter(genre, Genre =="Science Fiction" )
science_fiction_movies <- select(science_fiction_movies, Title, Genre)

science_fiction_movies

sumOfSFMovies <- count(science_fiction_movies)
sumOfSFMovies
