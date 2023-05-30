package org.tnsif.exceptiondemo;

import java.util.Scanner;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x=s.nextInt();
		int y=s.nextInt();
		try {
			System.out.println(x/y);
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled" +e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
	}





