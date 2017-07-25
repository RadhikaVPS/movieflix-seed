package io.egen.rs.movieflix.rs.service;

import io.egen.rs.movieflix.rs.entity.Actor;

public interface ActorService {

	
	public Actor addActor(Actor actor);
	public Actor editActor(Actor actor);
	public void deleteActor(Actor actor);
	
}
