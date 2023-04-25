//Program to demonstrate on for loop
package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopProgram {
	//print 1 to N numbers
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N = sc.nextInt();
		for (int i=1;i<=N;i++)
		{
			System.out.print(i+ " ");	
		}
		
	}

}
