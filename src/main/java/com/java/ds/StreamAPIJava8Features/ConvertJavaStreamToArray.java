package com.java.ds.StreamAPIJava8Features;

import java.util.Arrays;
import java.util.List;

public class ConvertJavaStreamToArray {
	public static void main(String[] args) {
		System.out.println("This is the Example Of The Convert Java Stream to Array");
//		1 : First method is Using Stream.toArray(IntFunction)
		List<String> list = Arrays.asList("A","B","C","D");
		System.out.println("The List of The String Data is ");
		System.out.println(list);
//		Converting The List To Array 
		System.out.println("The Array Of The data from The List is ");
		String[] arrList = list.stream().toArray(String[] :: new );
		for(String arrData : arrList) {
			System.out.println(arrData);
		}
	}

}
