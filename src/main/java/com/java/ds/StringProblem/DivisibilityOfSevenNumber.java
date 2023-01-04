package com.java.ds.StringProblem;

class Division{
	public static void getDivisionBySeven(int number) {
		int i=0;
		while(i<number) {
			System.out.println("Inside The Loop");
			int temp = number/10;
			int twice = temp*2;
			number = number/10;
			int remainingDigits =number-twice; 
			i++;
		}
	}
}

public class DivisibilityOfSevenNumber {
	public static void main(String[] args) {
		Division.getDivisionBySeven(371);
	}

}
