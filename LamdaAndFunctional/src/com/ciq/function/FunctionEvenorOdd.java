package com.ciq.function;

import java.util.function.Function;

public class FunctionEvenorOdd {
	public static void main(String[] args) {
		Function<Integer,String> Test=in->{if(in%2==0)
			return "EVEN";
			else 
				return "odd";
			};
			System.out.println(Test.apply(20));
			System.out.println(Test.apply(55));
		}
		
	}


