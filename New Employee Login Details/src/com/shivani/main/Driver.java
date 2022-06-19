package com.shivani.main;

import java.util.*;
import com.shivani.model.*;
import com.shivani.services.*;

public class Driver {
	public static void main(String[] args) {

		Employee employee = new Employee("Shivani","Chhipa");

		CredentialServices cs = new CredentialServices();
		String generatedEmail;
		char[] generatedPassword;
		 


		System.out.println("Pleaes enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");



		Scanner sc= new Scanner(System.in);
		int option = sc.nextInt();





		switch (option) {

		case 1: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "tech");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;

		case 2: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "admin");
		generatedPassword= cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;

		case 3: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "hr");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;

		case 4: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "legal");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;

		default: System.out.println("Please provide the correct department");


		}
	}
}

