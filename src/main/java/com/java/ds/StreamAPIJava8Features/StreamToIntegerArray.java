package com.java.ds.StreamAPIJava8Features;

import java.util.Arrays;
import java.util.List;

public class StreamToIntegerArray {
	public static void main(String[] args) {
		System.out.println("this is the Example StreamToIntegerArray.java");
		List<Integer> listOfInteger = Arrays.asList(10,20,30,40);
		System.out.println("The List Of The Integer is ");
		System.out.println(listOfInteger);
		Integer[] intArray = listOfInteger.stream()
				.map(square -> square*square)
				.toArray(Integer[] :: new);
		for(Integer sqr : intArray) {
			System.out.println(sqr);
		}
	}

}
