package io.egen.rs.movieflix.rs.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import io.egen.rs.movieflix.rs.entity.Actor;

public class ActorRepositoryImp implements ActorRepository {

	@PersistenceContext
	public EntityManager em;

	@Override
	public Actor addActor(Actor actor) {
		em.persist(actor);
		return actor;
	}

	@Override
	public Actor editActor(Actor actor) {
		return em.merge(actor);
	}

	@Override
	public void deleteActor(Actor actor) {
		em.remove(actor);
	}
	
	
	
}
