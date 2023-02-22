package com.java.ds.TaskAssignByMe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employ{
	private int id;
	private String firstName;
	private String lastName;
	public Employ(int id, String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
	}


}

public class MadhuTaskQuestions {
	public static void main(String[] args) {
		//		Integer[] ints = new Integer[] {1,2,3,4,5};
		//		System.out.println("The Array is ");
		//		System.out.println(ints);
		//		List<Integer> list = Arrays.asList(ints);
		//		System.out.println("The List is ");
		//		System.out.println(list);
		String data = "This is a test String and 'This is Sunil Name I want'";
		Pattern pattern = Pattern.compile("'(.*?)'");
		Matcher matcher = pattern.matcher(data);
		if (matcher.find())
		{
			System.out.println(matcher.group(1));
		}
	}

}
