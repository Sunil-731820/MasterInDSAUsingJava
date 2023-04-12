package com.java.ds.StreamAPIJava8Features;

import java.util.stream.Stream;

public class ForEachOrderedVsForEach {
	public static void main(String[] args) {
		System.out.println("The First use of Using Sequential Stream ");
		Stream.of("A","B","C","D")
		.forEach(data -> System.out.println(data));
		
		System.out.println("The Use code for forEachOrdered method");
		Stream.of("A","B","C","D")
		.forEachOrdered(orderData -> System.out.println(orderData));
		
		System.out.println("The Second use Of The Using The parellel Stream ");
		System.out.println("Using The For Each Loop");
		Stream.of("A","B","C","D")
		.parallel()
		.forEach(data -> System.out.println(data));
		System.out.println("using the for Each Ordered");
		Stream.of("A","B","C","D")
		.parallel()
		.forEachOrdered(order -> System.out.println(order));
	}

}
