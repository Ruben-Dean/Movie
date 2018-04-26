package com.qa.business.service;

import javax.inject.Inject;

import com.qa.business.repository.IMovieRepository;

public class MovieService implements IMovieService {

	@Inject
	private IMovieRepository repo;
	
	@Override
	public String getAllMovies() {
		
		return repo.listAllMovies();
	}

	@Override
	public String getAMovie(Long id) {
		
		return repo.getAMovie(id);
	}

	@Override
	public String createMovie(String JSONMovie) {
		
		return repo.createMovie(JSONMovie);
	}

}
