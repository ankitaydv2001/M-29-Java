package org.tnsif.regularexpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherClassExample {
	
	public static void main(String[] args) {
		Pattern p=Pattern.compile("job");
		Matcher m=p.matcher("Java Programming is enough"+"to get a job");
		while(m.find()) {
			System.out.println("pattern found from: " +m.start()+" "+(m.end()-1));
		}
	}

}
