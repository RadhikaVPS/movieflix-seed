package io.egen.rs.movieflix.rs.Exception;

public class UserAlreadyExsistsException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public  UserAlreadyExsistsException(String message) {
		super(message);
	}
	
	public  UserAlreadyExsistsException(String message, Throwable cause) {
		super(message, cause);
	}

}
