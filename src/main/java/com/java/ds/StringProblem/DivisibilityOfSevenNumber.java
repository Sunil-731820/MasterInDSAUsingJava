package com.java.ds.StringProblem;

import java.util.Scanner;

class Division{
	
	static boolean isDivisibleBy7(int number) {
		if(number<0) {
			return isDivisibleBy7(-number);
		}
		if(number==0 || number==7) {
			return true;
		}
		if(number<10) {
			return false;
		}
		return isDivisibleBy7(number/10-2*(number-number/10*10));
	}
}

public class DivisibilityOfSevenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int number = sc.nextInt();
		if(Division.isDivisibleBy7(number)) {
			System.out.println("The Numberis Divisible By 7");
		}else {
			System.out.println("The Number is Not Division By 7");
		}
	}

}
