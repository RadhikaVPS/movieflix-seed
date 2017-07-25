package io.egen.rs.movieflix.rs.service;

import java.util.List;

import io.egen.rs.movieflix.rs.entity.Comments;
import io.egen.rs.movieflix.rs.entity.Movie;

public interface CommentsService {
	public String postComments(String input);
	public List<Comments> byMovieTitle (Movie title);

}
