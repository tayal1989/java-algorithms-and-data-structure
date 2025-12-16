package com.learning.singlylinkedlist;

//12 Program

public class LinkedListAddition {
	
	private Node head ;
	
	private static class Node {
		private int data ;
		private Node next ;
		
		public Node(int data) {
			this.data = data ;
			this.next = null ;
		}
	}
	
	public void printList() {
		Node current = head ;
		
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next ;
		}		
		System.out.print("null");
	}
	
	public void addAtBeginning(int data) {
		Node newNode = new Node(data);	// Created a newNode whose value is data and next is null
		/* 
		 * As head points to null, and newNode next also points to null, we have to insert 
		 * newNode before head node
		 */
		newNode.next = head ;	// Now both are related as their next value is null
		head = newNode;			// newNode becomes head and now newNode becomes over
		// Consider with two newNode then it will have more clarity
	}
	
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode ;
			return ;
		}
		
		Node current = head ;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode ;
	}
	
	public void addAnywhere(Node prevNode, int data) {
		Node newNode = new Node(data);
		
		newNode.next = prevNode.next;
		prevNode.next = newNode ;
	}
	
	public void deleteByKey(int data) {
		Node current = head ;
		Node prev = null ;
		
		if(current != null && current.data == data) {
			head = current.next;
			return ;
		}
		
		while(current != null && current.data != data) {
			prev = current ;
			current = current.next;
		}
		
		if(current == null) {
			return ;
		}
		
		prev.next = current.next ;
	}
	
	public void deleteByPosition(int position) {
		Node current = head ;
		Node prev = null ;
		int count = 0 ;
		
		if(position == 0) {
			head = current.next;
			return ;
		}
		
		while(current != null && position != count) {
			prev = current ;				
			count++;
			current = current.next;
		}
		
		prev.next = current.next;		
	}
	
	public void deleteCompleteList() {
		head = null ;
	}
	
	public int lengthOfLinkedList() {
		if(head == null) {
			return 0 ;
		}
		
		Node current = head ;
		int count = 0 ;
		while(current != null) {
			count++ ;
			current = current.next;
		}
		return count;
	}
	
	public boolean searchDataInLinkedList(int searchElement) {
		if(head == null) {
			return false ;
		}
		
		Node current = head ;
		while(current != null) {
			if(current.data == searchElement) {
				return true ;
			}
			current = current.next ;
		}
		
		return false ;
	}
	
	public int getDataFromNode(int position) {
		Node current = head ;
		int element = 0;
		int count = 0;
		
		while(current != null) {
			if(position == count) {
				return current.data;
			}
			count++;
			current = current.next;
		}
		
		return element ;
	}
	
	public void getMiddleNode() {
		if(head == null) {
			System.out.println("No elements in the linked list");
		}
		
		Node slow = head ;
		Node fast = head ;
		
		while(fast != null && fast.next != null) {	// Observe both are fast nodes to handle even and odd length scenarios
			slow = slow.next ;
			fast = fast.next.next ;
		}
		
		System.out.println("Middle Node Data --> " + slow.data);
	}
	
	public void getNthNodeFromEndOfLL(int n) {		
		Node current = head ;
		int lengthOfLL = lengthOfLinkedList();
		
		if(lengthOfLL < n) {
			return ;
		}
		
		for(int ind = 0 ; ind < lengthOfLL - n ; ind++) {
			current = current.next ;
		}
		
		System.out.println("Nth node from end of linked list : " + current.data);
	}
	
	public static void main(String[] args) {
		LinkedListAddition lla = new LinkedListAddition();
		lla.head = new Node(1);		// 1
		Node second = new Node(2);
		Node third = new Node(3);
		
		// Now we will connect them together to form a chain
		lla.head.next = second ;	// 1 --> 2
		second.next = third ;		// 1 --> 2 --> 3 --> null
		lla.printList();
		System.out.println();
		
		lla.getMiddleNode();
		
		lla.addAtBeginning(0);		
		lla.printList();
		System.out.println();
		
		lla.getMiddleNode();
		
		lla.addAtEnd(4);
		lla.printList();
		System.out.println();
		
		lla.addAnywhere(second, 10);
		lla.printList();
		System.out.println();
		
		System.out.println("Length of Linked List --> " + lla.lengthOfLinkedList());
		
		int searchElement = 3 ;
		if(lla.searchDataInLinkedList(searchElement)) {
			System.out.println("Search Key " + searchElement + " Found !!!");
		} else {
			System.out.println("Search Key " + searchElement + " Not Found !!!");
		}
		
		searchElement = 5 ;
		if(lla.searchDataInLinkedList(searchElement)) {
			System.out.println("Search Key " + searchElement + " Found !!!");
		} else {
			System.out.println("Search Key " + searchElement + " Not Found !!!");
		}

		System.out.println("Element --> " + lla.getDataFromNode(3));
		
		lla.printList();
		System.out.println();
		lla.getNthNodeFromEndOfLL(2);
		
		lla.deleteByKey(0);
		lla.printList();
		System.out.println();
		
		lla.getNthNodeFromEndOfLL(2);
		
		lla.deleteByKey(10);
		lla.printList();
		System.out.println();
		
		lla.deleteByPosition(0);
		lla.printList();
		System.out.println();
		
		lla.deleteByPosition(1);
		lla.printList();
		System.out.println();
		
		System.out.print("Deleted completed list --> ");
		lla.deleteCompleteList();
		lla.printList();
		System.out.println();
	}

}
