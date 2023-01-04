package com.java.ds.LinkedListDataStructureProblems;

import java.util.LinkedList;

class Middle{
	public static void getMiddleElementInLinkedList() {
		LinkedList<Integer> lk = new LinkedList<Integer>();
		lk.add(1);
		lk.add(2);
		lk.add(3);
		lk.add(4);
		System.out.println("the Middle Element is ");
		int middle = lk.size()/2;
		System.out.println(middle);
		System.out.println("The Middle Element of The LinkedList is ");
		System.out.println(lk.get(middle));
	}
}

public class MiddleElementOfTheGivenLinkedList {
	public static void main(String[] args) {
		System.out.println("This is The Example of The Middle Element of The Lk");
		Middle.getMiddleElementInLinkedList();
	}

}
