package org.tnsif.enumeration;

public class EmployeeEnumeration {
	//Program to demonstrate on Enumeration
	enum empType
	{
		//enum constant
		CONTRACT,PERMANENT,PARTTIME;
	}
	void print(empType a)
	{
		if(a==empType.CONTRACT) 
		{
			System.out.println("You are contract based");
		}
		else if(a==empType.PERMANENT) 
		{
			System.out.println("You are Permanent");
		}
		else 
			System.out.println("You are Part-time");
		}
	
	public static void main(String[] args) {
		empType a=empType.PERMANENT;
		System.out.println(a);
	}

}
