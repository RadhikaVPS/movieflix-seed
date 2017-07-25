package io.egen.rs.movieflix.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.egen.rs.movieflix.rs.entity.Comments;
import io.egen.rs.movieflix.rs.entity.Movie;
import io.egen.rs.movieflix.rs.repository.CommentsRepository;

public class CommentsServiceImp implements CommentsService{
	
	@Autowired
	CommentsRepository repository;

	@Override
	public String postComments(String input) {
		return repository.postComments(input);
	}

	@Override
	public List<Comments> byMovieTitle(Movie title) {
		return repository.byMovieTitle(title);
	}
	
	
	
	

}
