package com.java.ds.StringProblem;

import java.util.Scanner;

class Reverse{
	public static void getReverseStringOfWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String words = sc.nextLine();
		System.out.println("The String  is ");
		System.out.println(words);
		int size = words.length();
		System.out.println("The Size of That words is ");
		System.out.println(size);
		String reverseWords = "";
		char ch;
		System.out.println("Printing the Each Character Using for Loop");
		for(int i=0;i<size;i++) {
			 ch=words.charAt(i);
			 reverseWords +=ch;
		}
		System.out.println("After The Reversing The String Of The Words");
		StringBuilder builder = new StringBuilder();
		builder.append(words);
		builder.reverse();
		System.out.println(builder);
		
	}
}
public class ReverseWordsInGivenString {
	public static void main(String[] args) {
		Reverse.getReverseStringOfWord();
	}

}
