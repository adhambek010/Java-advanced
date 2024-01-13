package com.advanced.entity;

public class User {

	private int user_id;
	private String username;
	private String email;
	public User(int user_id, String username, String email) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
	}
	/**
	 * @return the useer_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param useer_id the useer_id to set
	 */
	public void setUser_id(int useer_id) {
		this.user_id = useer_id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [useer_id=" + user_id + ", username=" + username + ", email=" + email + "]";
	}
	
	
}
