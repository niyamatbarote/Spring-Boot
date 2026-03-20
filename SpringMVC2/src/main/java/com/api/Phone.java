package com.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Phone {

	@NotBlank(message = "Number Cannot be Blank")
	private String countryCode;
	@NotBlank(message = "Number Cannot be Blank")
	@Size(min = 10, message = " * Number Must contain 10 digits" )
	private String phone;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return getCountryCode() + "-" + getPhone();
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
