package com.learning.singlylinkedlist;

//07 Program

public class InsertNodeInSortedLinkedList {
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
	
	public Node insertNodeInSortedOrder(int data) {
		boolean flag = false;	// For 1st node
		Node newNode = new Node(data);
		
		if(head == null) {
			return newNode;
		}
		
		Node current = head;
		Node previous = null;
		
		while(current != null && current.data < data) {
			flag = true;
			previous = current;
			current = current.next;
		}
		
		if(! flag) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		
		newNode.next = current;
		previous.next = newNode;
		return head;
	}
	
	public static void main(String[] args) {
		InsertNodeInSortedLinkedList insert = new InsertNodeInSortedLinkedList();
		insert.push(4);
		insert.push(2);
		insert.push(1);
		insert.print();
		insert.insertNodeInSortedOrder(5);
		insert.print();
		insert.insertNodeInSortedOrder(0);
		insert.print();
	}

}
