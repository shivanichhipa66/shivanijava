package com.shivani.services;

import java.util.*;
import com.shivani.model.*;

public class CredentialServices {
	public char [] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%^&*~+_=-";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		//using random method
		Random random = new Random();

		char[] password = new char[8];

		for(int i=0; i<8; i++) {

			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	public void showCredentials(Employee employee ,String email,char[] generatedPassword){

		System.out.println("Dear "+employee.getFirstName()+" "+"your generated credentials are as follows");
		System.out.println("Email--> "+ email);
		System.out.println("Password-->"+generatedPassword);
		System.out.println();

		{

		}
	}
}