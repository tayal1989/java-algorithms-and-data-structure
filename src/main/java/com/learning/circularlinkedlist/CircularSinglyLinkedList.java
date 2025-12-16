package com.learning.circularlinkedlist;

import java.util.NoSuchElementException;

/**
 * @author Vishal Agarwal
 * @version Creation time: 11-Sep-2021 5:03:34 pm
 * @classDescription
*/

public class CircularSinglyLinkedList {

	private Node last;
	private int length;
	
	private class Node {
		private Node next;
		private int data;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createCircularLinkedList() {
		Node first = new Node(1);
		Node second = new Node(5);
		Node third = new Node(10);
		Node fourth = new Node(15);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	public void displayCircularLinkedList() {
		if(last == null) {
			return;
		}
		
		Node first = last.next;
		
		while(first != last) {
			System.out.print(first.data + " --> ");
			first = first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertFirst(int data) {
		Node temp = new Node(data);
		
		if(last == null) {
			last = temp;
		} else {
			temp.next = last.next;
		}
		
		last.next = temp;
		length++;
	}
	
	public void insertLast(int data) {
		Node temp = new Node(data);
		
		if(last == null) {
			last = temp;
			last.next = last;
		} else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		
		length++;
	}
	
	public int deleteFirstNode() {
		if(isEmpty()) {
			throw new NoSuchElementException("Circular linked list is already empty");
		}
		
		Node temp = last.next;
		int result = temp.data;
		if(last == last.next) {
			last = null;
		} else {
			last.next = temp.next;
		}
		
		temp.next = null;
		length--;
		return result;
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//		csll.createCircularLinkedList();
//		csll.displayCircularLinkedList();
		
//		csll.insertFirst(1);
//		csll.insertFirst(5);
//		csll.insertFirst(10);
//		csll.insertFirst(15);
		
		csll.insertLast(1);
		csll.insertLast(5);
		csll.insertLast(10);
		csll.insertLast(15);
		csll.displayCircularLinkedList();
		
		System.out.println(csll.deleteFirstNode());
		csll.displayCircularLinkedList();
		System.out.println(csll.deleteFirstNode());
		csll.displayCircularLinkedList();
		System.out.println(csll.deleteFirstNode());
		csll.displayCircularLinkedList();
		System.out.println(csll.deleteFirstNode());
		csll.displayCircularLinkedList();
		System.out.println(csll.deleteFirstNode());
		csll.displayCircularLinkedList();
	}
}
