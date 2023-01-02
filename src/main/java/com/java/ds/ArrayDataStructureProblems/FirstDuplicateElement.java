package com.java.ds.ArrayDataStructureProblems;

import java.util.Scanner;

public class FirstDuplicateElement {
	
	public static void getFirstDuplicateElement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element In the Array ");
			arr[i] = sc.nextInt();
		}
		// The Array is 
		for(int j=0;j<size;j++) {
			System.out.print(arr[j]+" ");
		}
		
		for(int j=0;j<size;j++) {
			if(arr[j]==arr[j]) {
				System.out.println("The Duplicate Element Found in the Array");
				System.out.println(arr[j]);
				break;
			}
		}
		
		
	}
	public static void main(String[] args) {
		getFirstDuplicateElement();
	}

}
