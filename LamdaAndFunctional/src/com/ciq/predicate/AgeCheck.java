package com.ciq.predicate;

import java.util.function.Predicate;

public class AgeCheck {
	public static void main(String[] args) {
		Predicate<Integer> age=a->(a>18);
		System.out.println(age.test(20));
		System.out.println(age.test(17));
		
		//redicate<String> name=
		
	}

}
