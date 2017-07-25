package io.egen.rs.movieflix.rs.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.egen.rs.movieflix.rs.entity.Comments;
import io.egen.rs.movieflix.rs.entity.Movie;


public class CommentsRepositoryImp implements CommentsRepository {
	
	@PersistenceContext
	public EntityManager em;

	@Override
	public String postComments(String input) {
		em.persist(input);
		return input;
	}

	@Override
	public List<Comments> byMovieTitle(Movie title) {
		TypedQuery<Comments> query = em.createNamedQuery("Comments.byMovieTitle", Comments.class);
		return query.getResultList();
	}
	
	

}
