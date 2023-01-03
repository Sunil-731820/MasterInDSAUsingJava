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
//		Sorting The First Array 
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size1;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting The First Array is ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+"");
		}
		
//		Sorting The Second Array 
		for(int i=0;i<size1;i++) {
			for(int j=i+1;j<size1;j++) {
				if(arr1[i]>arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		System.out.println("After Sorting The Second Array is ");
		for(int i=0;i<size1;i++) {
			System.out.println(arr1[i]+"  ");
		}
		
//		Sorting The Third Array is 
		for(int i=0;i<size2;i++) {
			for(int j=i+1;j<size2;j++) {
				if(arr2[i]>arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println("After Sorting the Third Array is ");
		for(int i=0;i<size2;i++) {
			System.out.println(arr2[i]+ " ");
		}
		System.out.println("The Common Element In the Array is ");
//		Finding The Common Element After the  Sorted Array 
		int i=0,j=0,k=0;
		while(i<size && j<size1 && k<size2) {
			if(arr[i]==arr1[j] && arr1[j]==arr2[k]) {
				System.out.println(arr[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr[i]<arr1[j]) {
				i++;
			}
			else if(arr1[j]<arr2[k]) {
				j++;
			}else {
				k++;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("this is the Example Of The finding the Common Element In Three Sorted Arrays");
		getCommonElementInThreeSortedArray();
	}

}
