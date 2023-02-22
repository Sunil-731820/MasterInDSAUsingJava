package com.java.ds.RegexProblem;

public class ReplaceAllNonAlphanumericCharactersWithEmptyStrings {
	public static void main(String[] args) {
		System.out.println("This is The Example Of the replace all non-alphanumeric characters with empty strings");
		String input = " Chlamydia_spp. IgG, IgM & IgA Abs (8006) ";
		System.out.println(input);
		String replaceString = input.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("The Empty String is ");
		System.out.println(replaceString);
	}
}
