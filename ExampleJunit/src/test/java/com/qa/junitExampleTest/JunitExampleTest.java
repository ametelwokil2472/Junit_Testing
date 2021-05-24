package com.qa.junitExampleTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitExampleTest {


	// Assertions// =======// fail();// assetTrue | assertFalse// assertEquals| assertNotEquals// assertNull | assertNotNull// assertSame | assertNotSame


	
	
	@BeforeAll
	public static void start() {
		System.out.println("TEST STARTING");
	}
	@BeforeEach
	public  void beforEach() {
		System.out.println("Hello Mavenrrrr Each");
	}
	@AfterEach
	public  void afterEach() {
		System.out.println("TEST ENDING");
	}
	
	@Test
	public void testHello1() {
		System.out.println("Hello Maven");
		
	}
	
	@Test
	public void testHello() {
		System.out.println("Hello Maven hy");
	}
	@AfterAll
	public static void end() {
		System.out.println("Maven byee");
		
	}
}
