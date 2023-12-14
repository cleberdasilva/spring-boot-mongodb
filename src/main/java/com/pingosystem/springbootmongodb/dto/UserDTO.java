package com.pingosystem.springbootmongodb.dto;

import java.io.Serializable;

import com.pingosystem.springbootmongodb.domain.User;

public class UserDTO  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String email;
	
	public UserDTO(){}
	
	//constructor to instantiate after entity object correspondent
	public UserDTO(User obj){
		id  = obj.getId();
		name = obj.getEmail();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
