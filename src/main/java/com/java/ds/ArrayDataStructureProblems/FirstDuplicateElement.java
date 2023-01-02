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
		System.out.println("------------------------------");
		for(int j=0;j<size;j++) {
			for(int k=j+1;k<size;k++) {
				if(arr[j]==arr[k]) {
					System.out.println("Duplicate Element Found");
					System.out.println(arr[j]);
					break;
				}
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		getFirstDuplicateElement();
	}

}
