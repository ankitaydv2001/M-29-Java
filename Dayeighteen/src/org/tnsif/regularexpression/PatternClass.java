//Program to demonstrate on matches of regular expression
package org.tnsif.regularexpression;
import java.util.Scanner;
import java.util.regex.Pattern;
public class PatternClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String input=s.nextLine();
		String pattern="Hey there, I am using regular expression";
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		

	}

}
