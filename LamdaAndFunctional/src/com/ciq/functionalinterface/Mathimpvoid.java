package com.ciq.functionalinterface;

public class Mathimpvoid {
	public static void main(String[] args) {
		

	
	Math sum=(a,b)->System.out.println(a+b);
	Math sub=(a,b)->System.out.println(a-b);
	Math mul=(a,b)->System.out.println(a*b);
	Math div=(a,b)->System.out.println(a/b);
	Math mad=(a,b)->System.out.println(a%b);
	sum.caliculate(10, 12);
	sub.caliculate(10, 15);
	mul.caliculate(45, 2);
	div.caliculate(433, 6);
	mad.caliculate(24, 3);

}
}