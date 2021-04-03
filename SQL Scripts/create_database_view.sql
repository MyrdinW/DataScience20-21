-- maakt view om alles te kunnen zien 
CREATE VIEW imdball AS
SELECT movie.title, movie.year, actor.actor, actress.actress, genre.genre, rating.votes, rating.rating
FROM movie
LEFT JOIN actor on actor.title = movie.title
LEFT JOIN actress on actress.title = movie.title
JOIN genre on genre.title = movie.title
JOIN rating on rating.title =  movie.title
group by movie.title
;

select *
from imdball

