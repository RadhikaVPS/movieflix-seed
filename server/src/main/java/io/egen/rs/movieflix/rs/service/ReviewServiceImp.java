package io.egen.rs.movieflix.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.egen.rs.movieflix.rs.entity.Review;
import io.egen.rs.movieflix.rs.repository.ReviewRepository;

@Service
public class ReviewServiceImp implements ReviewService {
	
	@Autowired 
	ReviewRepository repository;

	@Override
	public List<Review> sortByIMDBRating(int imdbRating) {
		return repository.sortByIMDBRating( imdbRating);
	}

	@Override
	public List<Review> sortByIMDBVotes(String imdbVotes) {
		return repository.sortByIMDBVotes( imdbVotes);
	}
	
	

	
	
	
}
