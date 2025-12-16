package com.learning.singlylinkedlist;

//05 Program

public class FindNthNodeFromEndOfSinglyLinkedList {
	Node head;
	
	private static class Node {
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void findNodeFromEnd(int number) {
		Node current = head;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		if(number > count) {
			throw new IllegalArgumentException(number + " is greater than the number of nodes in the list");
		}
		
		current = head;
		
		for(int i = 1 ; i < count - number + 1 ; i++) {
			current = current.next;
		}
		
		System.out.println("Nth Node from end of linked list : " + current.data);
	}

	public static void main(String[] args) {
		FindNthNodeFromEndOfSinglyLinkedList find = new FindNthNodeFromEndOfSinglyLinkedList();
		find.push(0);
		find.push(1);
		find.push(2);
		find.push(3);
		find.push(4);
		find.print();
		find.findNodeFromEnd(4);
	}

}
