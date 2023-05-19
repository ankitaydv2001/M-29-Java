//demonstrate a string buffer example
package org.tnsif.stringsprogram;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer str1= new StringBuffer("Ankita");
		
		//by default,capacity of any string is 16
		System.out.println(str1.capacity());
		System.out.println(str1.charAt(2));
		
	}
}
