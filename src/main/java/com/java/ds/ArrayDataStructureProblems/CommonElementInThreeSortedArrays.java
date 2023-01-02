package com.java.ds.ArrayDataStructureProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CommonElementInThreeSortedArrays {
	
	public static void getCommonElementInThreeSortedArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The First Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element in the array");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Element In The First Arrays ");
		for(int j=0;j<size;j++) {
			System.out.println(arr[j]);
		}
		System.out.println("Enter the Size of the Second Array");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		for(int j=0;j<size1;j++) {
			System.out.println("Enter the Element Of The Second Array");
			arr1[j] = sc.nextInt();
		}
		System.out.println("The Element of The Second Array");
		for(int k=0;k<size1;k++) {
			System.out.println(arr1[k]);
		}
		
		System.out.println("Enter the Size Of The Third Array");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for(int k=0;k<size2;k++) {
			System.out.println("Enter the Element in  The Third Array");
			arr2[k] = sc.nextInt();
		}
		
		System.out.println("the third Array is ");
		for(int i=0;i<size2;i++) {
			System.out.println(arr2[i]);
		}
//		Converting the Array to List
		List<Integer> list1 = Arrays.stream(arr).collect(Collectors.toList());
		
		System.out.println("The First Array List is ");
		System.out.println(list1.toString());
		System.out.println("Sorting the First Array using Stream");
//		List<Integer> list1 = 
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("this is the Example Of The finding the Common Element In Three Sorted Arrays");
		getCommonElementInThreeSortedArray();
	}

}
