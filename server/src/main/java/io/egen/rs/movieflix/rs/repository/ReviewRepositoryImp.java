package io.egen.rs.movieflix.rs.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.rs.movieflix.rs.entity.Review;

@Repository
public class ReviewRepositoryImp implements ReviewRepository{
	
	

	@PersistenceContext
	public EntityManager em;

	@Override
	public List<Review> sortByIMDBRating(int imdbRating) {
		
		TypedQuery<Review> query = em.createNamedQuery("Review.imdbRating", Review.class);
//		query.setParameter("year", year);
		return query.getResultList();
	}

	@Override
	public List<Review> sortByIMDBVotes(String imdbVotes) {
		TypedQuery<Review> query = em.createNamedQuery("Review.sortByIMDBVotes", Review.class);
//		query.setParameter("genre", genre);
		return query.getResultList();

	}
}
