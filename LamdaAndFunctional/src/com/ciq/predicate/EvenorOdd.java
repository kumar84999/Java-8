package com.ciq.predicate;

import java.util.function.Predicate;

public class EvenorOdd {
	public static void main(String[] args) {
		Predicate<Integer> even=n->(n%2==0);
		System.out.println(even.test(6));
		Predicate<Integer> odd=o->(o%2!=0);
		System.out.println(odd.test(3));
		
	}

}
