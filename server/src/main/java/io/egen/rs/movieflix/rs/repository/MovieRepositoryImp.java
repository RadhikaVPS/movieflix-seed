package io.egen.rs.movieflix.rs.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.rs.movieflix.rs.entity.Movie;


@Repository
public class MovieRepositoryImp implements MovieRepository{

	@PersistenceContext
	public EntityManager em;

	@Override
	public List<Movie> findByYear(String year) {
		
		TypedQuery<Movie> query = em.createNamedQuery("Movie.fingByYear", Movie.class);
//		query.setParameter("year", year);
		return query.getResultList();
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.fingByGenre", Movie.class);
//		query.setParameter("genre", genre);
		return query.getResultList();
		
	}

	@Override
	public List<Movie> findByType(String type) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findByType", Movie.class);
		return query.getResultList();
	}

	@Override
	public List<Movie> viewCatalog(String type) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findByType", Movie.class);
		query.setParameter("type", type);
		return query.getResultList();
	}

	@Override
	public List<Movie> listOfMovies(Movie type) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.listOfMovie", Movie.class);
		List<Movie> movies = query.getResultList();
		return movies;
	}

	@Override
	public List<Movie> listOfSeries(Movie type) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.listOfSeries", Movie.class);
		List<Movie> movies = query.getResultList();
		return movies;
	}

	@Override
	public Movie findMovieDetails(String name) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findMovieDetails", Movie.class);
		query.setParameter("title", name);
		Movie movie = query.getResultList().get(0);	
		return movie;
	}

	@Override
	public Movie findTheMovie(Movie title) {
		return em.find(Movie.class, title);
	}

	@Override
	public Movie addMovie(Movie movie) {
		em.persist(movie);
		return movie;
	}

	@Override
	public Movie editMovie(Movie movie) {
		em.merge(movie);
		return movie;
	}

	@Override
	public void deleteMovie(Movie movie) {
		em.remove(movie);
	}

}
