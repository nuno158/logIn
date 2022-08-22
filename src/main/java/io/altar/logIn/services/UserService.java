package io.altar.logIn.services;

import io.altar.logIn.model.User;
import io.altar.logIn.repositories.UserRepository;

public class UserService extends EntityServices<User, UserRepository>{

	public UserService() {
		this.rep = UserRepository.getInstance();	
	}
	
	public boolean login(String username, String password) {
		return rep.login(username, password);
	}

}
