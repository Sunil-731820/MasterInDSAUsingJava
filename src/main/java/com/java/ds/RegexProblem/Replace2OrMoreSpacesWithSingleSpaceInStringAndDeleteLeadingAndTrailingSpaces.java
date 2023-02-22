package com.java.ds.RegexProblem;

public class Replace2OrMoreSpacesWithSingleSpaceInStringAndDeleteLeadingAndTrailingSpaces {
	public static void main(String[] args) {
		System.out.println("This is The Example Of the replace 2 or more spaces with single space in string and delete leading and trailing spaces");
		String test = " Test String " ;
		System.out.println("The Input String is ");
		System.out.println(test);
		String afterReplacement = test.replaceAll("\\s{2,}", " ").trim();
		System.out.println(afterReplacement);
	}

}
