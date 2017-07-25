package io.egen.rs.movieflix.rs.Exception;

public class MovieAlreadyExsistsException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public  MovieAlreadyExsistsException(String message) {
		super(message);
	}
	
	public  MovieAlreadyExsistsException(String message, Throwable cause) {
		super(message, cause);
	}

}
