package io.altar.logIn.controllers;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.altar.logIn.model.EntityModel;
import io.altar.logIn.repositories.EntityRepository;
import io.altar.logIn.services.EntityServices;

public abstract class EntityController<M extends EntityModel, S extends EntityServices<M, R>, R extends EntityRepository<M>> implements IController<M>{

	protected S service;
	
	@Override
	@Path("create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON) // o q envias
	@Produces(MediaType.TEXT_PLAIN) // o q recebes
	public M create(M entidade) {
		return service.create(entidade);
	}

	@Override
	@Path("remove/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(@PathParam("id") long id) {
		service.remove(id);
	}
	
	@Override
	@Path("getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<M> getAll() {
		return new ArrayList<M>(service.getAll());
	}


}
