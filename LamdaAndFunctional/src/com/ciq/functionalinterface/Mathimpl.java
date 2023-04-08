package com.ciq.functionalinterface;

public class Mathimpl {
	public static void main(String[] args) {
		MathR sum=(a,b)->a+b;
		MathR sub=(a,b)->a-b;
		MathR mul=(a,b)->a*b;
		MathR div=(a,b)->a/b;
		MathR mad=(a,b)->a%b;
		MathR Sqr=(a,b)->a*a+b*b+2*a*b;
		System.out.println("Add "+sum.caliculate(10, 12));
		System.out.println(("sub "+sub.caliculate(15, 12)));
		System.out.println(("mul "+mul.caliculate(12, 6)));
		System.out.println(("div "+div.caliculate(433, 6)));
		System.out.println("mad "+mad.caliculate(433, 6));
		System.out.println("sqr "+Sqr.caliculate(10, 12));
		
}

}





