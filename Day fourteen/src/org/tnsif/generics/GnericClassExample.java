//to demonstrate on generic class example
package org.tnsif.generics;

class GenericClass<T> {
	//t is data  type, x is varaiable
	T x;
	void print(T x)
	{
		this.x=x;
	}
	T accept()
	{
		return x;
	}
	
}
	public class GnericClassExample {
		
	public static void main(String[] args) {
		GenericClass<String>obj=new GenericClass<>();
		obj.print("Ankita");
		System.out.println(obj.accept());
		

}
}