package io.egen.rs.movieflix.rs.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.rs.movieflix.rs.entity.User;

@Repository
public class UserRepositoryImp implements UserRepository {

	
	@PersistenceContext
	public EntityManager em;

	@Override
	public User signUpUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User editUser(User user) {
		return em.merge(user);
	}

	@Override
	public void deleteUser(User user) {
		em.remove(user);
	}

	@Override
	public User loginUser(String userName, String password,User user) {
		
		TypedQuery<User> query = em.createNamedQuery("User.loginUser", User.class);
		query.setParameter(0,userName);
		query.setParameter(1,password);
		User check = query.getSingleResult();
		if (check != null && check.getPassword().equals(user.getPassword())) {
			
			return user;
		}
		return null;
	}

	@Override
	public void signOut(User user) {
		em.close();
	}
	
	@Override
	public User findByEmail(String userEmail) {
	
	TypedQuery<User> query = em.createNamedQuery("User.findByEmail", User.class);
	query.setParameter("userEmail", userEmail);
	User check = query.getSingleResult();
	if (check != null ) {
		return check;
	}
	return null;
}
	
	
	
}
