package io.egen.rs.movieflix.rs.repository;

import java.util.List;

import io.egen.rs.movieflix.rs.entity.Movie;

public interface MovieRepository {
	
	public List<Movie> findByYear(String year);
	public List<Movie> findByGenre(String genre);
	public List<Movie> findByType(String type);
	public List<Movie> viewCatalog(String type);
	public List<Movie> listOfMovies(Movie type);
	public List<Movie> listOfSeries(Movie type);
	public Movie findMovieDetails(String name);
	public Movie findTheMovie(Movie title);
	public Movie addMovie(Movie movie);
	public Movie editMovie(Movie movie);
	public void deleteMovie(Movie movie);
	

}
