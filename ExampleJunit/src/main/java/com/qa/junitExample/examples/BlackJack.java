package com.qa.junitExample.examples;

public class BlackJack {
	
//private BlackJack() {};
	public static int blackjack(int a, int b) {
		  if (a>21) a = 0;
		  if (b>21) b = 0;

		  if (a>b) {
		    return a;
		  }else {
		    return b;
		  }
		}

}
