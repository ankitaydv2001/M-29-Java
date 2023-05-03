//program to demonstrate on array class
package org.tnsif.arrays;

public class ArraysClassDemo {
	
	public static void main(String[]args) {
		
		int array[]= {12,67,54,90,270};
		
		System.out.println(Array.toString(array));
		//sorting the array
		Array.sort(array);
		System.out.println(Array.toString(array));
	}

}
