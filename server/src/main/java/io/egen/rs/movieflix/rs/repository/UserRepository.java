package io.egen.rs.movieflix.rs.repository;

import io.egen.rs.movieflix.rs.entity.User;

public interface UserRepository {
	
	public User signUpUser(User user);
	public User editUser(User user);
	public void deleteUser(User user);
	public User loginUser(String userName, String password,User user);
	public void signOut(User user);
	public User findByEmail(String userEmail);

}
