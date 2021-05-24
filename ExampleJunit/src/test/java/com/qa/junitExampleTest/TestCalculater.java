package com.qa.junitExampleTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.junitExample.examples.Calculator;

public class TestCalculater {

	@Test
	public void testAdd() {
		double result1= Calculator.add(39, 11);
		assertEquals(50, result1);

	}

	
	@Test
	public void testMult() {
		double result2 = Calculator.mult(3, 11);
		assertEquals(33, result2);

	}

	@Test
	public void testSub() {
		double result3 = Calculator.sub(39, 11);
		assertEquals(28, result3);

	}

	@Test
	public void testDiv() {
		double result4 = Calculator.div(65, 5);
		assertEquals(13, result4);

	}

	@Test
	public void testMod() {
		double result4 = Calculator.mod(65, 10);
		assertEquals(5, result4);

	}
}
