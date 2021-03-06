package com.sella.training.ctb.common.utility.numberutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This NumberUtility class is used to check whether the number enterd by user is valid or not
 * 
 * @author instage42
 * 
 */
public class NumberFormatUtility {
	private  Pattern patNumber;
	private  Matcher numberMatcher;

	String numberPattern = "^[0-9]+$";

	public NumberFormatUtility() {
		patNumber = Pattern.compile(numberPattern);
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public  boolean validateNumber(String number)
	 {
		boolean isValid=false;
		if (number == null || number.equals("")) 
		{
			isValid=false;
		}

		numberMatcher = patNumber.matcher(number);
		if(numberMatcher.matches()==true)
		{
			isValid=true;
		}
		return isValid;
	
	}

}
