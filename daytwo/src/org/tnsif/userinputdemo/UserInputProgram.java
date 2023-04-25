//program to demonstrate compile-time input
package org.tnsif.userinputdemo;

import java.util.Scanner;

public class UserInputProgram {
	public static void main(String[] args) {
		//compile-time input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Salary: ");
		float salary = s.nextFloat();
		System.out.println("Enter your name: ");
		String name = s.next();
		s.nextLine();
		System.out.println("Enter your name1: ");
		String name1 = s.nextLine();
		System.out.println("Enter the character: ");
		char ch = s.next().charAt(1);
		System.out.println("Salary is: " +salary);
		System.out.println("Name is: " +name);
		System.out.println("Name1 is: " +name1);
		System.out.println("Character is: " +ch);
		
		s.close();
	}

}
