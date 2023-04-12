package com.java.ds.StreamAPIJava8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamToStringArray {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The StreamToStringArray");
		List<String> data = Arrays.asList("Krishna","Mahesh","Kush");
		System.out.println("The List of The String Data is ");
		System.out.println(data);
//		filtering The data On The basis Of The Name Start With K Letters 
		String[] nameStartWithK = data.stream()
				.filter(name -> name.startsWith("K"))
				.toArray(size -> new String[size]);
		System.out.println("After Filtering The Data Start With K is ");
		for(String nameStratWithK : nameStartWithK) {
			System.out.println(nameStratWithK);
		}
	}

}
