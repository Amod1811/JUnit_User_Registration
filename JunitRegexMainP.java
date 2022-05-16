package junitregexprogram;

import java.util.Scanner;
/*
 * As a User need to follow pre-defined Name, email  Rule
 */

public class JunitRegexMainP {

	public static void main(String[] args) {
		
		System.out.println("Welcome to JunitRegexProgram");
		Scanner scanner = new Scanner(System.in);
		
		
		ValidateUser validate = new ValidateUser();
		
		validate.ValidateFirstName("Amod");
		validate.ValidateFirstName("amod");
		
		validate.validateValidEmail("abc.xyz@bl.co.in");
		validate.validateValidEmail("Abc.67.xyz@bl.co.in");
		
		validate.validateMobileNumber("91 8806458673");
		validate.validateMobileNumber("9155852828285");
	}

}
