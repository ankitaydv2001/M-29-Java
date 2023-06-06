//Program to demonstrate on filtering
package org.tnsif.steamapi;
import java.util.Arrays;
import java.util.List;
public class FilteringExample {
	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Ankita","Novina","Dia");
		obj.stream().filter(i->i.length()>5).forEach((i)->System.out.print(i+" "));
		
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		
		obj.stream().limit(2).forEach((i)->System.out.print(i+" "));
		
		obj.stream().skip(2).forEach((i)->System.out.print(i+" "));
	}

}
