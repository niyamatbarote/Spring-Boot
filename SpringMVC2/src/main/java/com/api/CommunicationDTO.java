package com.api;

import jakarta.validation.constraints.NotBlank;

public class CommunicationDTO {
	
	private String email;
	@NotBlank(message = "Number Cannot be Blank")
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
