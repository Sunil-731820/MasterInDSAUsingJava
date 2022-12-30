package com.java.ds.ArrayDataStructureProblems;

import java.util.Scanner;

public class CountThePairWithGivenSum {
	
	
	public static void getCountPairWithGivenSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element in the Array ");
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+  "  ");
		}
		
		System.out.println("Enter the Sum to Count The number of Pairs");
		int sum = sc.nextInt();
		int temp;
		for(int i=0;i<size;i++) {
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("This is the Example Of the Count pair With Given Sum");
		
	}

}
