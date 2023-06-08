package org.tnsif.unittestcase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class FirstunitUnitTestCase {
	// @Test annotation is used to perform the testing on given user defined method
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("SimpleTesting")
	void display()
	{
		System.out.println("First Junit5 Testing");
	}

}
