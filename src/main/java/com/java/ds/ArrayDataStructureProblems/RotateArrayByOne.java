package com.java.ds.ArrayDataStructureProblems;

import java.util.Scanner;

public class RotateArrayByOne {
	
	public static void rotateArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element in the Array");
			array[i] = sc.nextInt();
		}
		System.out.println("the Array of The Element Is ");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+ " ");
		}
		int temp = array[0];
		System.out.println("The First Position Element is ");
		System.out.println(temp);
		for(int j=1;j<size;j++) {
			array[j-1] = array[j];
		}
		array[size-1] = temp;
		System.out.println("After One Rotation the Array is ");
		for(int k=0;k<size;k++) {
			System.out.print(array[k]+ "  ");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Array rotation By One element");
		rotateArray();
	}

}
