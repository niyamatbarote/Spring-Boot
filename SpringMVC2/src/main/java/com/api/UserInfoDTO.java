package com.api;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// Data Transfer Object (DTO)

// **DATA BINDING** :: In Web MVC (Model-View-Controller), data binding is the process of synchronizing 
// data between the application's Model (the underlying data objects) and the View (the user interface).It automates
// the transfer of data, eliminating the need to manually extract values from HTTP requests or update UI elements individually.
public class UserInfoDTO {
	
	@NotBlank(message = " * Your Name Cannot be Empty..!")
//	@Min(value = 2, message = " * Enter atleast Two Characters ")
	@Size(min = 2,max=10, message = " * Enter atleast Two Characters & at Max 10 Char")
	private String yourName;
//	@Min(value = 2, message = " * Enter atleast Two Characters ")
	@Size(min = 2, max=10, message = " * Enter atleast Two Characters & at Max 10 Char")
	@NotBlank(message = " * Your Name Cannot be Empty..!")
	private String crushName;
	
	public boolean isTnc() {
		return tnc;
	}
	public void setTnc(boolean tnc) {
		this.tnc = tnc;
	}
	// Terms and Condition CheckBox
	// @AssertTrue is Used to Make sure That checkBox Must true, else print message
	@AssertTrue(message = " * You Must Agree Terms and Conditions")
	private boolean tnc;
	
	// toString Methods :
	@Override
	public String toString() {
		return "UserInfoDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}
	// Counstructor :
	// **NOTE** Internally its doing ..:
	// UserInfoDTO user = new UserInfoDTO();
	public UserInfoDTO() {
		
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
