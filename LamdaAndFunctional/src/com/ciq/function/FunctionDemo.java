package com.ciq.function;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		Function<String,Integer> ln=str->str.length();
		System.out.println(ln.apply("mahaansh"));
		System.out.println(ln.apply("kumar"));
		System.out.println(ln.apply("Sweety"));
		
	}

}
