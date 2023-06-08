//Program to deminstrate on different Junit methods
package org.tnsif.unittestcase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void display()
	{
		System.out.println("First Junit5 Testing");
	}
	
	//Denotes that the annotation method should be 
	//executed before all the test methods
	@Test
	@BeforeAll
	void print()
	{
		System.out.println("BeforeAll method is executing...");
	}
	
	//Denotes that the annotation method should be 
	//executed after each the test methods
	@Test
	@AfterEach
	@Disabled
	void accept()
	{
		System.out.println("AfterEach method is executing...");
	}
}
