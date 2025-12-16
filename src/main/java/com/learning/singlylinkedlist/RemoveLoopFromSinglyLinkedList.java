package com.learning.singlylinkedlist;

//10 Program

public class RemoveLoopFromSinglyLinkedList {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void printNode() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null\n");
	}
	
	public void createLoop() {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
	public void detectLoop() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast) {
				System.out.println("Loop Detected");
				removeLoop(slow);
				break;
			}
		}
	}
	
	public void removeLoop(Node slow) {
		Node temp = head;
		while(slow.next != temp.next) {
			slow = slow.next;
			temp = temp.next;
		}
		slow.next = null;
	}

	public static void main(String[] args) {
		RemoveLoopFromSinglyLinkedList removeLoop = new RemoveLoopFromSinglyLinkedList();
		removeLoop.createLoop();
//		removeLoop.printNode(); // Will go for an infinite loop
		removeLoop.detectLoop();
		removeLoop.printNode();
	}

}
