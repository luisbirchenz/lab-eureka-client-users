package com.lab.user.api.dto;

public class UserDto {
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	public UserDto(Long id, String firstName, String lastName, String userName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
	}
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
}
