package com.ciq.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateAndOr {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		Predicate<Integer> prd1=a->(a>3);
		Predicate<Integer> prd2=a->(a>8);
		
     //predicate And
		list.stream().filter(prd1.and(prd2)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("*********************");
		
	//predicate OR
		list.stream().filter(prd1.or(prd2)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("*******");
	}

}
