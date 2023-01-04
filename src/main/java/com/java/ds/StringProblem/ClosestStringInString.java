package com.java.ds.StringProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ClosestString{
	public static void getClosestStringInString(String str1 , String str2) {
		int length1 = str1.length();
		int length2 = str2.length();
		if(length1==length2) {
			System.out.println("The length of The Both The String Are Same ");
			String[] arr = str1.split("");
			System.out.println("The Array Of The String is ");
			System.out.println(arr);
		}else if(length1>length2) {
			System.out.println("Sorry You can Not Compare Because First String is Bigger in Lenth");
		}else {
			System.out.println();
		}
	}
}

public class ClosestStringInString {
	public static void main(String[] args) {
		System.out.println("this is The Example Of The Closest String ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The first String");
		String str1 = sc.nextLine();
		System.out.println("Enter The Second String");
		String str2 = sc.nextLine();
		ClosestString closestString = new ClosestString();
		closestString.getClosestStringInString(str1, str2);
	}
}
