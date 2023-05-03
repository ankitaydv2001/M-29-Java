//program to demonstrate on array of object
package org.tnsif.arrays;

public class ArrayOfObject {
	
	public static void main(String[]args) {
		
		//array of customer class
		Customer[] arr = new Customer[2];
		
		arr[0] = new Customer(23456,"Ankita");
		arr[1] = new Customer(45698,"Vaishnavi");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}
		
	}

}
