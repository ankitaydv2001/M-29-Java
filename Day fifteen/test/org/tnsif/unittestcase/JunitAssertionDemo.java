//Program to demostrate on different Junit Assertion methods
package org.tnsif.unittestcase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class JunitAssertionDemo {

	@Test
	/*fails if expression is not true*/
	void test() {
		assertTrue(10>5);
	}
	
	@Test
	/*fails if expression is not false*/
	void dislay() {
		assertFalse(10>5);
	}

	@Test
	/*fails if expression is not null*/
	void accept() {
		assertNull(null);
	}
}
