package io.altar.logIn.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.logIn.model.EntityModel;

public abstract class EntityRepository<T extends EntityModel> {

	Map<Long, T> datab = new HashMap<Long, T>();
	private long counter = 1;

	// Create User
	public T create(T entity) {
		entity.setId(counter);
		datab.put(entity.getId(), entity);

		counter++;
		return entity;
	}

	// Remove User
	public void remove(long id) {
		if (datab.containsKey(id)) {
			datab.remove(id);
		}
	}

	// Get All
	public Collection<T> getAll() {
		return datab.values();
	}




}
