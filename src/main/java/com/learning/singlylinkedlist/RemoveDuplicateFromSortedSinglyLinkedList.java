package com.learning.singlylinkedlist;

//06 Program

public class RemoveDuplicateFromSortedSinglyLinkedList {
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
	
	public void removeDuplicate() {
		if(head == null) {
			return;
		}
		
		Node current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		print();
	}

	public static void main(String[] args) {
		RemoveDuplicateFromSortedSinglyLinkedList remove = new RemoveDuplicateFromSortedSinglyLinkedList();
		remove.push(3);
		remove.push(3);
		remove.push(2);
		remove.push(1);
		remove.push(1);
		remove.print();
		remove.removeDuplicate();
	}

}
