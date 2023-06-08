//Program to demonstrate on Parameterized Testing

package org.tnsif.unittestcase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParmeterizaedTestCase {

	@ParameterizedTest
	@ValueSource(strings= {"Abhinav","Ankita","Novina"})
	void test(String str) {
		System.out.println("To demonstrate Parmeterizaed Test Case"+"Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Sandhya","Yatish"})
	void accept(String str) {
		assertNotNull(str);
	}
	
}
