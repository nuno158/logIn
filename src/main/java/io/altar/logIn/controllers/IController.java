package io.altar.logIn.controllers;

import java.util.Collection;

public interface IController<M>{

	M create(M entidade);

	void remove(long id);
	
	Collection<M> getAll();

}
