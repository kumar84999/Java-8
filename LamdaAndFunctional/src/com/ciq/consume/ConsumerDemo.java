package com.ciq.consume;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> cons1=t->System.out.println(t);
		cons1.accept("kumar");
		Consumer<Integer> cons2=i->System.out.println(i);
		cons2.accept(120);
	}

}
