package com.api;


public class SignUpDTO {
	
	private String user;
	private String username;
	private char[] password;
	private String country;
	private String[] hobbies;
	private String Gender;
	
	// Using The communcation DTO for Phone and Email only :
	private CommunicationDTO commune = new CommunicationDTO();
	
	
public CommunicationDTO getCommune() {
		return commune;
	}
	public void setCommune(CommunicationDTO commune) {
		this.commune = commune;
	}
	//	public CommunicationDTO getCommune() {
//		return commune;
//	}
//	public void setCommune(CommunicationDTO commune) {
//		this.commune = commune;
//	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	
}
