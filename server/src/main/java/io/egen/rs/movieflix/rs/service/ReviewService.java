package io.egen.rs.movieflix.rs.service;

import java.util.List;

import io.egen.rs.movieflix.rs.entity.Review;

public interface ReviewService {

	
	public List<Review> sortByIMDBRating(int imdbRating);
	public List<Review> sortByIMDBVotes(String imdbVotes);

	
}
