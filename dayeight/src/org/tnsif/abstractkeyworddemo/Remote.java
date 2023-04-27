// program to demonstrate abstract class and method
package org.tnsif.abstractkeyworddemo;

public abstract class Remote {
	
	String cellName;
	/* abstract class can have contain abstract and 
	 * non-abstract method
	 */
	
	//abstract method
	abstract void functionRemote();
	
	//concrete method
	public void display()
	{
		System.out.println("Cell name is: " +cellName);
	}
}
	//implementable class
	class RemoteChild extends Remote {
	
	void functionRemote() {
		System.out.println("Abstract method is implemented");
	}
	
	void create() {
		System.out.println("Abstract method -2");
		}
}







