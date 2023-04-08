package com.ciq.functionalinterface;

public class FunctionalImpl  {
	public static void main(String[] args) {
		
	

	FunctionalDemo welocome=()->System.out.println("welcome to java8");
	FunctionalDemo hello=()->System.out.println("hai ramakka");
	welocome.function1();
	hello.function1();
	
}
}