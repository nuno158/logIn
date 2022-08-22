package io.altar.logIn.services;

import java.util.Collection;

import io.altar.logIn.model.EntityModel;
import io.altar.logIn.repositories.EntityRepository;
import io.altar.logIn.services.interfaces.ServiceCRUD;

public abstract class EntityServices<T extends EntityModel, U extends EntityRepository<T>> implements ServiceCRUD<T>{

	protected U rep;
	
	public T create(T e) {
		return rep.create(e);
	}

	
	public void remove(long id) {
		rep.remove(id);
	}
	
	public Collection<T> getAll() {
		return rep.getAll();
	}

}
