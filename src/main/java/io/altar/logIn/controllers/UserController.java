package io.altar.logIn.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.altar.logIn.model.User;
import io.altar.logIn.repositories.UserRepository;
import io.altar.logIn.services.UserService;

@Path("user")
public class UserController extends EntityController<User, UserService, UserRepository>{

	public UserController() {
		service = new UserService();
	}

	@Path("login")
	@POST 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN) 
	public boolean login(User u) {
		
		return service.login(u.getUsername(), u.getPassword());
	}
}
