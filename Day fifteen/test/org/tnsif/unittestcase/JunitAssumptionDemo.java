//Program to demonstrate on Junit Assumption
package org.tnsif.unittestcase;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
class JunitAssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(12==12);
	}
	
	@Test
	void accept() {
		Assumptions.assumeFalse(12==12);
	}

}
