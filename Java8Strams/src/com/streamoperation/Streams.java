package com.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer>streamInteger=list.stream();
		
	//filter mothod to used to filter the elements by given condition
		
		//List<Integer> even=streamInteger.filter(num->(num%2==0)).collect(Collectors.toList());
		//System.out.println(even);
		
		List<Integer> odd=streamInteger.filter(num->(num%2!=0)).collect(Collectors.toList());
		System.out.println(odd);
		
		List<String> names=Arrays.asList("kumar","kamal","ramya","ranjith","Srimaan","pooja","shaan","mahaansh");
		
		List<String> filtred1=names.stream().filter(st->st.startsWith("k")).collect(Collectors.toList());
		System.out.println("name start with k"+filtred1);
		
		
		List<String> filtred2=names.stream().filter(st->!st.startsWith("k")).collect(Collectors.toList());
		System.out.println("name start without k"+filtred2);
		
		
		//map method() is used the result with prasent element
		
		List<Integer> inti=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> result3=inti.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(result3);
		
		//distinct method() used to remove duplicate in steram
		List<Integer> intd=Arrays.asList(1,2,2,3,4,4,5,6,6,7,8,8,9);
		List<Integer> result4=inti.stream().distinct().collect(Collectors.toList());
		System.out.println(result4);
		
		//soted method() used to sort the items in stream
		List<Integer>listsort=Arrays.asList(1,8,9,5,4,6,7,3,2,0);
		listsort.stream().sorted().forEach(System.out::print);
		
		Random random= new Random();
		random.ints().limit(10).forEach(System.out::println);
		
	}

}
