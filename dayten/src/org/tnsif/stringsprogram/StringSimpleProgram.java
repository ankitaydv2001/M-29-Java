/* demonstrate a string program using string literal and 
 * new keyword
 */
package org.tnsif.stringsprogram;

public class StringSimpleProgram {
	public static void main(String[] args) {
		
		//using string literal
		String str1 = "Ankita";
		System.out.println("Using String literal: " +str1);
		
		//using new keyword
		String str2 = "Aanya";
		System.out.println("Using new keyword: " +str2);
		
		/*when the string is created using new keyword and 
		 * both the strings are sameit will create a memory for that string
		 * and using == we will be getting different (false)
		 */
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
	}

}
