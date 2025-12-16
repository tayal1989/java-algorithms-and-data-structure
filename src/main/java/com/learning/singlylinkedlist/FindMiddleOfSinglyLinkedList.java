package com.learning.singlylinkedlist;

//04 Program

public class FindMiddleOfSinglyLinkedList {
	Node head;
	
	private static class Node {
		int data;
		Node next;
		
		Node(int d) {
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
	
	public Node middle() {
		if(head == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	

	public static void main(String[] args) {
		FindMiddleOfSinglyLinkedList fm = new FindMiddleOfSinglyLinkedList();
//		fm.push(0);
		fm.push(1);
		fm.push(2);
		fm.push(3);
		fm.push(4);
		fm.push(5);
		fm.print();
		System.out.println("Middle Node : " + fm.middle().data);
	}

}
