package org.tnsif.operatordemo;

import java.util.Scanner;

public class SwitchCaseProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song input");
		int songInput = sc.nextInt();
		switch(songInput)
		{
		case 1:
			System.out.println("calm down");
			break;
		case 2:
			System.out.println("samjhawan");
			break;
		case 3:
			System.out.println("baarish");
			break;
		default:
			System.out.println("invalid entry");
			break;
		}
		sc.close();
	}

}
