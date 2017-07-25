package io.egen.rs.movieflix.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.rs.movieflix.rs.entity.Movie;
import io.egen.rs.movieflix.rs.service.MovieService;



@Controller
@RestController
@RequestMapping(path = "videos")
public class MovieController {

	@Autowired
	MovieService service;
	
	
	//Adds Movie
	@RequestMapping(method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie addMovie(@RequestBody Movie movie) {
		return service.addMovie(movie);
	}
	
	//Edit Movie
	@RequestMapping(method = RequestMethod.PUT, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public Movie editMovie(@PathVariable("id") String movieId, @RequestBody Movie movie) {
		return service.editMovie( movie);

	}
	
	//Delete Movie
	@RequestMapping(method = RequestMethod.DELETE, path = "{id}")	
	public void deleteMovie(@PathVariable("id") Movie movie) {
		 service.deleteMovie(movie);

	}

	//Finds searched "movie"
	@RequestMapping(method = RequestMethod.GET, path = "{id}",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie findTheMovie(@PathVariable("id") Movie title){
		return service.findTheMovie(title);
	}
	
	//Filters Movie by "type"
	@RequestMapping(method = RequestMethod.GET, path = "/movies/type/{type}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findByType(@PathVariable ("type") String type){
		return service.findByType(type);
	}
	
	//Filters Movie by "year"
	@RequestMapping(method = RequestMethod.GET, path = "/movies/year/{year}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findByYear(@PathVariable("year") String year){
		return service.findByYear(year);
	}
	
	//Filters Movie by "genre"
	@RequestMapping(method = RequestMethod.GET, path="/movie/genre/{genre}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findByGenre(@PathVariable("genre") String genre) {
		return service.findByGenre(genre);
	}
	
	//Finds Details for searched "movie"
	@RequestMapping(method = RequestMethod.GET,path="/movie/{movie_name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie findMovieDetails(@PathVariable("movie_name") String name) {
		return service.findMovieDetails(name);
	}
	
	// List of "Movies"
	@RequestMapping(method = RequestMethod.GET, path = "/movies", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> listOfMovies(Movie type){
		return service.listOfMovies(type);
	}
		
	//List of "Series"
	@RequestMapping(method = RequestMethod.GET, path = "/series", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> listOfSeries(Movie type){
		return service.listOfSeries(type);
	}

	@RequestMapping(method = RequestMethod.GET, path="/catalog/type", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> viewCatalog(String type){
		return service.viewCatalog(type);
	}
}
