package com.java.ds.RegexProblem;

import java.util.regex.Pattern;

public class AcceptAlphNumericCharacterOfLengthFive {
	public static void main(String[] args) {
		System.out.println("The Example Of The Given String which Accepts The Alpha Numeric Character Of length 5");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "java1"));
		
	}

}
