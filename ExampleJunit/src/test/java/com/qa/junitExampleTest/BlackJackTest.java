package com.qa.junitExampleTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.junitExample.examples.BlackJack;

public class BlackJackTest {

	
	@Test
	public void blackjackTest1() {
		int result1 = BlackJack.blackjack(22, 22);
		
		 assertEquals(0,result1);
	}

	@Test
	public void blackjackTest2() 
	{
		int result2 = BlackJack.blackjack(22, 12);
		
		 assertEquals(12,result2);
	}

	@Test
	public void blackjackTest() {
		int result3 = BlackJack.blackjack(10, 22);
		
		 assertEquals(10,result3);
	}
	
}


	

