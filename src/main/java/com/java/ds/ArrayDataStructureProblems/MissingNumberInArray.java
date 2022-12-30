package com.java.ds.ArrayDataStructureProblems;

import java.util.Scanner;

public class MissingNumberInArray {
	
	// Another Way To Check Missing Number in The Array
	public static int getMissingNumber(int arr[])
    {
        int i, total;
        int n = arr.length;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= arr[i];
        return total;
    }
	
	public static void getMissingNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element of the Array is ");
			array[i] = sc.nextInt();
		}
		System.out.println("the Array is ");
		for(int j=0;j<size;j++) {
			System.out.print(array[j]+ "   ");
		}
		//Sorting the Array using Bubble Sort
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After Sorting The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+ "  ");
		}
		
		// finding the Missing Values In The Array is 
		int index = 0;
		for(int k=0;k<size;k++) {
			if(array[k]==index) {
				//Found Because Index and Array Values Are Same 
				System.out.println("the Element Found In The Array" + array[k]);
				index++;
			}
			else {
				//Missing Because Index and Values are Not Same Here 
				System.out.println("The Missing Element In The Array is "+ array[k]);
			}
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Missing Values");
//		getMissingNumber();
		int[] number = {6, 3, 2, 4, 1};
        System.out.println("Missing Number is:" + getMissingNumber(number));
	}

}
