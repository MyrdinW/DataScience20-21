library(ggplot2)
library(dplyr)
rating <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/rating.csv")
actor <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/actor.csv")
actress <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/actress.csv")
genre <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/genre.csv")
movie <- read.csv("~/GitHub/DataScience20-21/SQL Scripts/Data CSV/movie.csv")

rating2 <- select(rating, Votes, Rating)
rating2

plot(rating2)
