package com.api;

public class CommunicationDTO {
	
	private String email;
	private Phone contact;
	
	
	public Phone getContact() {
		return contact;
	}

	public void setContact(Phone contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
