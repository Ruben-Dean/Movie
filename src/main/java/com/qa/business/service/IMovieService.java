package com.qa.business.service;

public interface IMovieService {
	String getAllMovies();
	
	String getAMovie(Long id);
	
	String createMovie(String JSONMovie);
	
	String deleteMovie(Long id);
	
	String updateMovie(String JSONMovie);
}
