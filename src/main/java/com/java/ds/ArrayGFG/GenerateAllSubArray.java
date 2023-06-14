package com.java.ds.ArrayGFG;

public class GenerateAllSubArray {
	
	static void printAllASubArray(int arr[], int start,int end) {
		if(end==arr.length) {
			return ;
		}else if(start>end) {
			printAllASubArray(arr, 0, end+1);
		}else {
			System.out.print("[");
			for(int i=start;i<end;i++) {
				System.out.print(arr[i]+",");
			}
			System.out.println(arr[end]+"]");
			printAllASubArray(arr, start+1, end);
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The EXample Of The GenerateAllSubArray in Java");
		int arr[] = {1,2,3};
		printAllASubArray(arr,0,0);
		
	}

}
