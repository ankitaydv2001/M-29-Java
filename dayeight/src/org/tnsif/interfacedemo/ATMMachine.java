// program to demonstrate on interface
package org.tnsif.interfacedemo;

public interface ATMMachine {
	
	
	//int amount
	int amountWithdraw = 1250;
	int amountDeposit = 2000;
	/*by default all methods inside an interface
	 * are public abstract
	 */
	void withdraw();
	void deposit();
	

}
