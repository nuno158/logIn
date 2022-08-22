package io.altar.logIn.services.interfaces;

import java.util.Collection;

import io.altar.logIn.model.EntityModel;

public interface ServiceCRUD<T extends EntityModel> {

	// Create
	T create(T entity);
	// Remove
	void remove(long id);
	// Get All
	Collection<T> getAll();
}
