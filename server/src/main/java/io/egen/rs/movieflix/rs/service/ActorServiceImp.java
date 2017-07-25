package io.egen.rs.movieflix.rs.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.egen.rs.movieflix.rs.entity.Actor;
import io.egen.rs.movieflix.rs.repository.ActorRepository;

public class ActorServiceImp implements ActorService{
	
	@Autowired 
	ActorRepository repository;

	@Override
	public Actor addActor(Actor actor) {
		return repository.addActor(actor);
	}

	@Override
	public Actor editActor(Actor actor) {
		return repository.editActor(actor);
	}

	@Override
	public void deleteActor(Actor actor) {
		repository.deleteActor(actor);
	}
	
	

}
