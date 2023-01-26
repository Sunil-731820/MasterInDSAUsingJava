package com.java.ds.StackDataStructure;

import java.util.Scanner;

class Stock{
	static void getStockSpanProblem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element of The Array ");
			arr[i] = sc.nextInt();
		}
		//Displaying The Array Is 
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
public class StockSpanProblem {
	public static void main(String[] args) {
		System.out.println("This is The EXample of The Stock Span Problems");
		Stock.getStockSpanProblem();
	}

}
