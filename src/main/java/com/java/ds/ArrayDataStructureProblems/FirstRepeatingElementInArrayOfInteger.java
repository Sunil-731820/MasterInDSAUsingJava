package com.java.ds.ArrayDataStructureProblems;

import java.util.Scanner;

class FirstRepeating{
	
	public static void getFirstRepeatingElement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element of The Array ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+ "  ");
		}
		System.out.println("Getting The First Repeating Element ");
		for(int i=0;i<size;i++) {
			for(int j=1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+ " ");
					break;
				}
			}
		}
	}
}

public class FirstRepeatingElementInArrayOfInteger {
	public static void main(String[] args) {
		FirstRepeating firstRepeating = new FirstRepeating();
		firstRepeating.getFirstRepeatingElement();
		
	}

}
