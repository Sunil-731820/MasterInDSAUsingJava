package com.java.ds.StringProblem;

import java.util.Scanner;

class LongestPrefix{
	public static void getPrefixOfString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String fullString = sc.nextLine();
		System.out.println("The String is ");
		System.out.println(fullString);
		System.out.println("Enter The SubString for Finding The prefix");
		String subString = sc.nextLine();
		System.out.println("The SubString is ");
		System.out.println(subString);
		int size1 = fullString.length();
		int size2 = subString.length();
		String result = "";
		for(int i=0,j=0;i<=size1-1 && j<=size2-1;i++,j++) {
			if(fullString.charAt(i) != subString.charAt(j)) {
				break;
			}
			result +=fullString.charAt(i);
			
		}
		System.out.println("The Result is ");
		 System.out.println(result);
		
		
	}
}

public class LongestCommonPrefixInString {
	public static void main(String[] args) {
		System.out.println("this is The Example Of The Common Longest Prefix in String");
		LongestPrefix.getPrefixOfString();
	}

}
