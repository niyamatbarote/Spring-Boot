package com.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.api.Phone;

public class PhoneNumFormatting implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String myInfo, Locale locale) throws ParseException {
		System.out.println("Outside Parse Logic");
		// Split the CountryCode and the PhoneNumber Using "split" method : 
		String[] splitter = myInfo.split("-");
		
		System.out.println("Inside Parse Logic -");
		// Insert the value into the countryCode and PhoneNumber :
		Phone phone = new Phone();
		
		// Insert the value into the countryCode
		phone.setCountryCode(splitter[0]);
		
		// Insert the value into the PhoneNumber
		phone.setPhone(splitter[1]);
		
		
		return phone;
	}

}
