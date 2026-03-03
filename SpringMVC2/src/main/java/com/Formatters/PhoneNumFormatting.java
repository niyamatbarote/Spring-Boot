package com.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.api.Phone;

public class PhoneNumFormatting implements Formatter<Phone> {

	@Override
	public String print(Phone ph, Locale locale) {
		return ph.getCountryCode()+"-"+ph.getPhone();
	}

	@Override
	public Phone parse(String myInfo, Locale locale) throws ParseException {
		System.out.println("Outside Parse Logic");
		
		// Insert the value into the countryCode and PhoneNumber :
				Phone phone = new Phone();
		
		// Split the CountryCode and the PhoneNumber Using "split" method : 
		String[] splitter = myInfo.split("-");
		// Check if the User Insert the Country Code or Not :
		int index = myInfo.indexOf('-');
		if (index < 1) {
			
			phone.setCountryCode("91");
			phone.setPhone(splitter[0]);
			
		} else {
			
		// Insert the value into the countryCode
		phone.setCountryCode(splitter[0]);
		
		// Insert the value into the PhoneNumber
		phone.setPhone(splitter[1]);
		
		}
		
		return phone;
		
	}

}
