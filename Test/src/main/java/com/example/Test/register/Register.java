package com.example.Test.register;

public class Register {

	private Integer id;
	private String username;
	private String password;
	private String email;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(Integer id, String username, String password, String email, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", address=" + address + "]";
	}
	
}
