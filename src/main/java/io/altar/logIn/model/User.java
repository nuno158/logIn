package io.altar.logIn.model;

public class User extends EntityModel {

	private String username;
	private String password;
	private int age;
	private String gender;
		
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", gender=" + gender + "]";
	}	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
