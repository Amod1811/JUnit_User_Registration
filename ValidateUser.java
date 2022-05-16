package junitregexprogram;

import java.util.regex.Pattern;

public class ValidateUser {

	public void ValidateFirstName(String name) {
		if(Pattern.matches("^[A-Z]{1}[A-Za-z]{3}", name))
		{
			System.out.println("Name is valid ");
			System.out.println("---------------");
		}
		else {
			System.out.println("Name should be First Character is capital and Maximum 4 number");
			System.out.println("-----------------");
		}
	}	
	public void validateValidEmail(String Email) {
		if(Pattern.matches("^[a-z]{3}[.]{1}[A-Za-z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.]{1}[a-z]*$*", Email)) {
			System.out.println("Email is valid");
			System.out.println("--------------");
		}
		else {	
			System.out.println("Email is not valid");
			System.out.println("------------------");
			}
		  }
	  

	public void validateMobileNumber(String number) {
		if(Pattern.matches("^[0-9]{2}\s[0-9]{10}",number))
		{
			System.out.println("Mobile Number is valid");
			System.out.println("------------------------");
	    }
		else {
			System.out.println("Enter Country code follow by Sapce And 10 Digit Number");
			System.out.println("---------------------");
		}
	}
}
