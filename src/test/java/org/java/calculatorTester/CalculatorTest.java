package org.java.calculatorTester;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test()
	public void addTest() {

	    int a = 2;
	    int b = 2;
	    float actual = Calculator.add(a, b);
	    int expected = 4;
	    assertEquals(expected, actual);
	}
	
	@Test()
	public void subtractTest() {

	    int a = 2;
	    int b = 2;
	    float actual = Calculator.subtract(a, b);
	    int expected = 0;
	    assertEquals(expected, actual);
	}
	
	@Test()
	public void divideTest() {

	    int a = 2;
	    int b = 2;
	    float actual = Calculator.divide(a, b);
	    int expected = 1;
	    assertEquals(expected, actual);
	}
	
	@Test()
	public void multiplyTest() {

	    int a = 4;
	    int b = 4;
	    float actual = Calculator.multiply(a, b);
	    int expected = 16;
	    assertEquals(expected, actual);
	}
	
	@Test()
	public void nameSurnameTest() {

		Employee e = new Employee();
		assumeTrue(e.name != null && e.surname != null);
	}
	
	@Test()
	public void dateOfBirthTest() {

		LocalDate today = LocalDate.now();
		Employee e = new Employee();
		
		assumeTrue(LocalDate.parse(e.dateOfBirth).isBefore(today));
	}
	
	@Test()
	public void roleTest() {

		final String role1 = "employee";
		final String role2 = "boss";
		Employee e = new Employee();
		
		assumeTrue(e.role.toLowerCase().equals(role1) || e.role.toLowerCase().equals(role2));
	}
	
	
}
