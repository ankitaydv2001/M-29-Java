//Program to demonstrate on ternary operator
package org.tnsif.operatordemo;

public class TernaryOperatorDemo {
	//syntax
	/*
	 * (condition)?"T":"F";
	  */
	public static void main(String[] args) {
		String isEven = (5%2==0) ? "Even":"Odd";
		System.out.println(isEven);
	}

}
