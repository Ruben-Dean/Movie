package com.qa.business.repository;

public interface IMovieRepository {

	String listAllMovies();
	String getAMovie(Long id);
	String createMovie(String movieJSON);
	String deleteMovie(Long id);
	String updateMovie(String movieJSON);

}
