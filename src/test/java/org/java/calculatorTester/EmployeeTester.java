package org.java.calculatorTester;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class EmployeeTester {

	@Test()
	public void nameSurnameTest() {

		Employee e = new Employee();
		assumeTrue(e.name != null);

	}
	
}
