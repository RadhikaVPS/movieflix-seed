package io.egen.rs.movieflix.rs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.egen.rs.movieflix.rs.Exception.MovieAlreadyExsistsException;
import io.egen.rs.movieflix.rs.Exception.MovieNotFoundException;
import io.egen.rs.movieflix.rs.entity.Movie;
import io.egen.rs.movieflix.rs.repository.MovieRepository;

@Service
public class MovieServiceImp implements MovieService{
	
	@Autowired
	MovieRepository repository;

	@Override
	public List<Movie> findByYear(String year) {
		return repository.findByYear(year);
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		return repository.findByGenre(genre);
	}

	@Override
	public List<Movie> findByType(String type) {
		return repository.findByType(type);
	}

	@Override
	public List<Movie> viewCatalog(String type) {
		return null;
	}

	@Override
	public List<Movie> listOfMovies(Movie type) {
		return repository.listOfMovies(type);
	}

	@Override
	public List<Movie> listOfSeries(Movie type) {
		return repository.listOfSeries(type);
	}

	@Override
	public Movie findMovieDetails(String name) {
		return repository.findMovieDetails(name);
	}

	@Override
	public Movie findTheMovie(Movie title) {
		Movie existing = repository.findTheMovie(title);
		if(existing == null) {
			throw new MovieNotFoundException("Movie - " + title + "not found.");
		}
		return existing;
	}
	

	@Override
	@Transactional
	public Movie addMovie(Movie movie) {
		Movie existing = repository.findTheMovie(movie);
		if(existing !=null) {
			throw new MovieAlreadyExsistsException("Movie -" + movie + "already exsists");
		}
		return repository.addMovie(movie);
	}

	@Override
	@Transactional
	public Movie editMovie(Movie movie) {
	
		Movie existing = repository.findTheMovie(movie);
		if(existing == null) {
			throw new MovieNotFoundException("Movie - " + movie + "not found.");
		}
		return repository.editMovie(movie);
	}

	@Override
	@Transactional
	public void deleteMovie(Movie movie) {
		Movie existing = repository.findTheMovie(movie);
		if(existing == null) {
			throw new MovieNotFoundException("Movie - " + movie + "not found.");
		}
		 repository.deleteMovie(movie);
	}
	
	

}
