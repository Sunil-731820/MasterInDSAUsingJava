package com.java.ds.ArrayDataStructureProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import jakarta.validation.constraints.AssertFalse.List;

public class UniQueSetAndDuplicateList {
	
	public static void getUniqueElementInSetAndDuplicateElementInList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		java.util.List<Integer> duplicate = new ArrayList<Integer>();
		Set<Integer> unique = new HashSet<Integer>();
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					duplicate.add(arr[i]);
				}else {
					System.out.print(arr[i]+"  ");
					unique.add(arr[i]);
				}
			}
		}
		System.out.println("The Duplicate Element Array is ");
		Iterator<Integer> itr = duplicate.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("The Unique Element is ");
		Iterator<Integer> itr1 = unique.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
	public static void main(String[] args) {
		System.out.println("This is the EXample of printing the Unique Element in the Set & Duplicate Element in the list");
		getUniqueElementInSetAndDuplicateElementInList();
	}

}
