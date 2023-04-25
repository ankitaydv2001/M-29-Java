//Program to demonstrate on nested if program
package org.tnsif.operatordemo;

import java.util.Scanner;

public class NestedIfProgram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
	if(num>0)
	{
		//nested if
		if(num<0)
		{
			System.out.println("Non-zero number");
		}
		else
		{
			System.out.println("Either Non-zero or Zero number");
		}
		
	}
	}

}
