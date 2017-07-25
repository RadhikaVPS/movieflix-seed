package io.egen.rs.movieflix.rs.repository;

import io.egen.rs.movieflix.rs.entity.Actor;

public interface ActorRepository {

	public Actor addActor(Actor actor);
	public Actor editActor(Actor actor);
	public void deleteActor(Actor actor);
	
}
