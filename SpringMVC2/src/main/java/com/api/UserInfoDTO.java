package com.api;

// Data Transfer Object (DTO)

// **DATA BINDING** :: In Web MVC (Model-View-Controller), data binding is the process of synchronizing 
// data between the application's Model (the underlying data objects) and the View (the user interface).It automates
// the transfer of data, eliminating the need to manually extract values from HTTP requests or update UI elements individually.
public class UserInfoDTO {
	
	private String yourName ="you";
	private String crushName = "your crush";
	
	// toString Methods :
	@Override
	public String toString() {
		return "UserInfoDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}
	// Counstructor :
	// **NOTE** Internally its doing ..:
	// UserInfoDTO user = new UserInfoDTO();
	public UserInfoDTO() {
		System.out.println("User Info DTO is Called using its Constructor ...!!!");
	}

	// Getter and Setter Methods
	public String getYourName() {
		return yourName;
	}
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	

}
