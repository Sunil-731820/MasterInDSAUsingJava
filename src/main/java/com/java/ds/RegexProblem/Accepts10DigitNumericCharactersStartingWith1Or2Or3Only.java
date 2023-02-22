package com.java.ds.RegexProblem;

import java.util.regex.Pattern;

public class Accepts10DigitNumericCharactersStartingWith1Or2Or3Only {
	public static void main(String[] args) {
		System.out.println("this is The Example Of The accepts 10 digit numeric characters starting with 1, 2 or 3 only");
		System.out.println(Pattern.matches("[123]{1}[0-9]{9}", "1953038949"));
		
	}

}
