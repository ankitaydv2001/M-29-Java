//Program to demonstrate on nested while loop
package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopProgram {
	public static void main(String[] args) {
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		while(i<=N) {
			System.out.println(i+ " ");
		}
	}

}
