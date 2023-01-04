package com.java.ds.StringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RomanNumberConversion{
	public static void getRomanToInt(String s) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		map1.put('I', 1);
		map1.put('V', 5);
		map1.put('X', 10);
		map1.put('L', 50);
		map1.put('C', 100);
		map1.put('D', 500);
		map1.put('M', 1000);
		
		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCCC");
		int number = 0;
		for(int i=0;i<s.length();i++) {
			number = number + (map1.get(s.charAt(i)));
		}
		System.out.println("The Number is "+ number);
		
	}
	
}
public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println("this is The Example of The Roman To integer Conversion");
		RomanNumberConversion conversion = new RomanNumberConversion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String for roman Number");
		String Roman = sc.nextLine();
		conversion.getRomanToInt(Roman);
	}

}
