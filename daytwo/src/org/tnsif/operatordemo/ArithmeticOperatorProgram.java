package org.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmeticOperatorProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Addition of two numbers: " +(x+y));
		System.out.println("Subtraction of two numbers: " +(x-y));
		System.out.println("Multiplication of two numbers: " +(x*y));
		System.out.println("Division of two numbers: " +(x/y));
		System.out.println("Modulo of two numbers: " +(x%y));
		
		
		
	}

}
