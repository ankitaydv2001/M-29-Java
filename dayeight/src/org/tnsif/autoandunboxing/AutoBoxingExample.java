//program to demonstrate on autoboxing
/* Autoboxing: conversion of of primitive to object type
 * example : character to char
 */
package org.tnsif.autoandunboxing;

public class AutoBoxingExample {

	public static void main(String[] args) {
		//primitive variable
		int num=1045;
		
		//autoboxing
		//converting primitive to object type
		Integer x=num;
		System.out.println("value of x is: "+x);
	}
}
