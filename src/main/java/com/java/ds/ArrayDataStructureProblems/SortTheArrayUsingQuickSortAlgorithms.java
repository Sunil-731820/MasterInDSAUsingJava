package com.java.ds.ArrayDataStructureProblems;

import java.util.Arrays;

public class SortTheArrayUsingQuickSortAlgorithms {
	public static int partition(int array[],int low,int high) {
//		Choose The Right most as pivot 
		int pivot = array[high];
//		Pivot for greater Element
		int i = (low-1);
//		Traverse Through all element and Compare Each Element
		for(int j=low;j<high;j++) {
			if(array[j]<=pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
//		Swap The Pivot Element With Greater ELement Specified By i
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
//		Return the Partition Where partition Is Done
		return (i+1);
	}
	
	public static void quickSort(int array[],int low,int high) {
		if(low<high) {
//			find The Pivot Element Such That 
//			Element smaller than pivot are on the Left
//			Element greater than pivot are on The Right
			int pi = partition(array, low, high);
//			for Left Of the pivot
			quickSort(array, low, pi-1);
//			for Right Of The pivot
			quickSort(array, pi+1, high);
		}
	}
	public static void main(String[] args) {
		int[] data = {8,7,2,1,0,9,6};
		System.out.println("The Unsorted Array is ");
		System.out.println(data.toString());
		int size = data.length;
		quickSort(data, 0, size-1);
		System.out.println("the Sorted Array is ");
		System.out.println(Arrays.toString(data));
	}

}
