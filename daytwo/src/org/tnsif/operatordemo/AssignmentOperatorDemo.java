//Program to demonstrate on assignment operators
package org.tnsif.operatordemo;

public class AssignmentOperatorDemo {
	public static void main(String[] args) {
		int a=12, b=5;
		int x=a++;  //12
		++a;  //++13//14
		--b;
		int y=b--;
		System.out.println(a);
		System.out.println(x);
		System.out.println(b);
		System.out.println(y);
	}

}
