package io.egen.rs.movieflix.rs.repository;

import java.util.List;

import io.egen.rs.movieflix.rs.entity.Comments;
import io.egen.rs.movieflix.rs.entity.Movie;
public interface CommentsRepository {
	
	public String postComments(String input);
	public List<Comments> byMovieTitle (Movie title);

}
