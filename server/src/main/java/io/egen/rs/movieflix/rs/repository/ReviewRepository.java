package io.egen.rs.movieflix.rs.repository;

import java.util.List;

import io.egen.rs.movieflix.rs.entity.Review;

public interface ReviewRepository {
	
	public List<Review> sortByIMDBRating(int imdbRating);
	public List<Review> sortByIMDBVotes(String imdbVotes);

}
