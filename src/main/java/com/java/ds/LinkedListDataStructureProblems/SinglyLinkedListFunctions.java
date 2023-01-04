package com.java.ds.LinkedListDataStructureProblems;

class node{
	int data ;
	node next;
	
	node(int value){
		data = value;
		next = null;
	}
}

public class SinglyLinkedListFunctions {
	
	 static node head = null;
	
//	function To add The Data At The Head Positions
	static void insertathead(int val) {
		node n = new node(val);
		n.next = head;
		head = n;
	}
	
//	Function To Display The Linked List 
	static void display() {
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+ " ->");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		System.out.println("I am going to perform All operation Of The LinkedList");
		insertathead(1);
		insertathead(2);
		insertathead(10);
		display();
	}
}
