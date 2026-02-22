package com.api;

public class Phone {
	
	private String countryCode;;
	
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
