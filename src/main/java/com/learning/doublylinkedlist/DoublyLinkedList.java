package com.learning.doublylinkedlist;

import java.util.NoSuchElementException;

/**
 * @author Vishal Agarwal
 * @version Creation time: 08-Aug-2021 8:02:41 pm
 * @classDescription
*/

public class DoublyLinkedList {
	private Node head ;
	private Node tail ;
	private int length ;
	
	private static class Node {
		private int data ;
		private Node next ;
		private Node previous ;
		
		Node(int data) {
			this.data = data ;
			this.previous = null ;
			this.next = null ;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null ;
		this.tail = null ;
		this.length = 0 ;
	}
	
	public boolean isEmpty() {
		return length == 0 ;	// head == null
	}
	
	public int length() {
		return length ;
	}
	
	public void printListInForwardDirection() {
		if(head == null) {
			return ;
		}
		
		Node current = head ;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next ;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void printListInBackwardDirection() {
		if(tail == null) {
			return ;
		}
		
		Node current = tail ;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.previous ;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			tail = newNode ;
		} else {
			head.previous = newNode ;
		}
		
		newNode.next = head ;
		head = newNode ;
		length++ ;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	
	public Node deleteFirstNode() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		Node temp = head;
		if(head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}
	
	public Node deleteLastNode() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		Node temp = tail;
		if(head == tail) {
			head = null;
		} else {
			temp.previous.next = null;
		}
		
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList() ;
//		dll.insertFirst(1);
//		dll.insertFirst(10);
//		dll.insertFirst(15);
//		dll.insertFirst(65);
		
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(65);
		
		dll.printListInForwardDirection();
//		dll.printListInBackwardDirection();
		
//		dll.deleteFirstNode();
//		dll.printListInForwardDirection();
//		
//		dll.deleteFirstNode();
//		dll.printListInForwardDirection();
//		
//		dll.deleteFirstNode();
//		dll.printListInForwardDirection();
//		
//		dll.deleteFirstNode();
//		dll.printListInForwardDirection();
//		
//		dll.deleteFirstNode();
//		dll.printListInForwardDirection();
		
		dll.deleteLastNode();
		dll.printListInForwardDirection();
		
		dll.deleteLastNode();
		dll.printListInForwardDirection();
		
		dll.deleteLastNode();
		dll.printListInForwardDirection();
		
		dll.deleteLastNode();
		dll.printListInForwardDirection();
		
		dll.deleteLastNode();
		dll.printListInForwardDirection();
	}

}
