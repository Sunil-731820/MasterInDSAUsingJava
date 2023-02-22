package com.java.ds.RegexProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringInGivenStringUsingRegex {
	public static void main(String[] args) {
		System.out.println("Finding the Sub String In Given String");
		String input  = "This is a test String and 'This is Sunil Name I want'";
		System.out.println("The given input is ");
		System.out.println(input);
		Pattern pattern = Pattern.compile("'(.*?)'");
		Matcher matcher = pattern.matcher(input);
		if(matcher.find()) {
			System.out.println(matcher.group());
		}else {
			System.out.println("No Sub String Found ");
		}
	}

}
