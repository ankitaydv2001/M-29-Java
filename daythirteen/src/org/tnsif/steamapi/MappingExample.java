//Program to demonstrate on map operation

package org.tnsif.steamapi;
import java.util.Arrays;
import java.util.List;

public class MappingExample {
	
	public static void main(String[] args) {
		//using collection
		List<String>obj=Arrays.asList("Ankita","Parag","Prathamesh");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));
	}

}
