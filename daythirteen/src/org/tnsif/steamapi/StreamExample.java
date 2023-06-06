//Program to demonstate stream
package org.tnsif.steamapi;

import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Stream<Integer>s1=Stream.of(12,54,75,45);
		s1.forEach((i)->System.out.print(i+" "));
	}

}
