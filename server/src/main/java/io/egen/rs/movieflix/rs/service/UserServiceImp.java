package io.egen.rs.movieflix.rs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.egen.rs.movieflix.rs.entity.User;
import io.egen.rs.movieflix.rs.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired 
	UserRepository repository;

	
	@Override
	@Transactional
	public User signUpUser(User user) {
		User checkUser = repository.findByEmail(user.getUserEmail());
		if (checkUser == null) {
			return null;
		}
		
		return repository.signUpUser(user);
	}

	@Override
	@Transactional
	public User editUser(User user) {
		User checkUser = repository.findByEmail(user.getUserEmail());
		if (checkUser == null) {
			return null;
		}
		return repository.editUser(user);
	}

	@Override
	public void deleteUser(User user) {
		repository.deleteUser(user);
	}

	@Override
	public User loginUser(String userName, String password, User user) {
		return null;
	}

	@Override
	public void signOut(User user) {
		repository.signOut(user);
		
	}

	@Override
	public User findByEmail(String userEmail) {
		User checkUser = repository.findByEmail(userEmail);
		if (checkUser == null) {
			return null;
		}
		
		return repository.findByEmail(userEmail);
	}
	
	

}
