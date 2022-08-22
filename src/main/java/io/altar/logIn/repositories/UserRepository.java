package io.altar.logIn.repositories;

import java.util.Map.Entry;

import io.altar.logIn.model.User;

public class UserRepository extends EntityRepository<User> {

	private static final UserRepository INSTANCE = new UserRepository();

	public static UserRepository getInstance() {
		return INSTANCE;
	}

	private UserRepository() {

	}

	// User Login Confirmation
	public boolean login(String username, String password) {
		boolean exists = false;
		for (Entry<Long, User> entry : datab.entrySet()) {
			System.out.println(entry.getValue().getUsername());
			System.out.println(username);

			System.out.println(entry.getValue().getPassword());
			System.out.println(password);

			if (entry.getValue().getUsername().equals(username) && entry.getValue().getPassword().equals(password)) {
				exists = true;
			}
		}
		return exists;
	}
}
