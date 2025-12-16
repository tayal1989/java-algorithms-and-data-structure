package com.learning.singlylinkedlist;

// 02 Program

public class SinglyLinkedList {
	
	private ListNode head;
	
	public void printList() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public int lengthOfNode() {
		ListNode current = head;
		int count = 0;
		if(head == null) {			
			return count;
		}
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	public void insertNodeAtBeginning(int data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			head = newNode;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertNodeAtEnd(int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		if(head == null) {
			head = newNode;
			return;
		}
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void insertNodeAtPosition(int position, int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		
		if(head == null) {
			head = newNode;
		} else if(position == 1) {
			newNode.next = current;
			head = newNode;
		} else {
			int count = 1;
			while(count < position - 1) {
				current = current.next;
				count++;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	
	public ListNode deleteFirstNode() {
		ListNode current = head;
		if(head == null) {
			System.out.println("No nodes");
			return null;
		}
		
		head = head.next;
		current.next = null;	// In order to break the connection of first node with second
		return current;
	}
	
	public ListNode deleteLastNode() {
		ListNode current = head;
		if(head == null || head.next == null) {
			if(head.next == null) {
				head = null;
			} else {
				System.out.println("No nodes");
			}
			return head;
		}
		
		while(current.next.next != null) {
			current = current.next;
		}
		
		current.next = null;
		return current;
	}
	
	public void deleteNodeAnywhere(int position) {
		if(head == null) {
			System.out.println("No nodes found");
			return;
		} else if (position == 1) {
			head = head.next;
		} else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	
	public void deleteNodeByKey(int data) {
		if(head == null) {
			System.out.println("No nodes found");
			return;
		}
		
		ListNode current  = head;
		ListNode previous = null;
		
		if(current != null && current.data == data) {
			head = current.next;
			return;
		}
		
		while(current != null && current.data != data) {
			previous = current;
			current = current.next;
		}
		
		if(current == null) {
			System.out.println("No such nodes with the given key found");
			return;
		}
		
		previous.next = current.next;
	}
	
	public void searchElement(int data) {
		ListNode current = head;
		while(current != null) {
			if(current.data == data) {
				System.out.println("Element Found");
				return;
			}
			current = current.next;
		}
		System.out.println("Element not found");
	}
	
	public void reverseLinkedList() {
		if(head == null) {
			return;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		while(previous != null) {
			System.out.print(previous.data + " --> ");
			previous = previous.next;
		}
		
		System.out.print("null\n");
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		sll.head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.printList();
		System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		
		sll.insertNodeAtBeginning(0);
		sll.printList();
		System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		
		sll.insertNodeAtEnd(50);
		sll.printList();
		System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		
		sll.insertNodeAtPosition(7, 25);
		sll.printList();
		System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		
		sll.searchElement(240);
		
		/*
		while(sll.lengthOfNode() != 0) {
			sll.deleteFirstNode();
			sll.printList();
			System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		}
		*/
		/*
		while(sll.lengthOfNode() != 0) {
			sll.deleteLastNode();
			sll.printList();
			System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		}
		*/
		sll.deleteNodeAnywhere(1);
		sll.printList();
		System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		
		sll.deleteNodeAnywhere(4);
		sll.printList();
		System.out.println("\nLength of singly linked list : " + sll.lengthOfNode());
		
		
		sll.deleteNodeByKey(50);
		sll.printList();
		System.out.println();
		
		sll.reverseLinkedList();
	}

}
