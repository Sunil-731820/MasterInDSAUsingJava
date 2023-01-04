package com.java.ds.LinkedListDataStructureProblems;



public class SinglyLinkedList {
	
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	public void addElement(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	
	public void displayElement() {
		Node currentNode = head;
		if(head==null) {
			System.out.println("LinkedList is Empty");
			return ;
		}else {
			System.out.println("The LinkedList is ");
			while(currentNode!=null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addElement(9);
		singlyLinkedList.addElement(2);
		singlyLinkedList.addElement(6);
		singlyLinkedList.displayElement();
	}

}
