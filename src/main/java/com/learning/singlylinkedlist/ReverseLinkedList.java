package com.learning.singlylinkedlist;

// 03 Program

public class ReverseLinkedList {
	static Node head ;
	
	static class Node {
		int data ;
		Node next ;
		
		Node(int d) {
			data = d ;
			next = null ;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data) ;
		newNode.next = head ;
		head = newNode ;
	}
	
	public static void printList(Node head) {
		Node n = head ;
		
		while(n != null) {
			System.out.print(n.data + " --> ");
			n = n.next ;
		}
		System.out.print("null");
	}
	
	public Node reverseLinkedList() {
		if(head == null) {
			return head ;
		}
		
		Node current = head ;
		Node next = null ;
		Node previous = null ;
		
		while(current != null) {
			next = current.next ;
			current.next = previous ;
			previous = current ;
			current = next ;
		}
		
		return previous ;
	}

	public static void main(String[] args) {
		ReverseLinkedList ll = new ReverseLinkedList();
		for(int i = 10; i > 0 ; i--) {
			ll.push(i);
		}
		printList(head);
		System.out.println();
		
		Node current = ll.reverseLinkedList();
		printList(current);
	}

}
