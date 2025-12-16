package com.learning.singlylinkedlist;

//11 Program

public class MergeTwoSortedLinkedList {

	Node head;
	
	public static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			this.data = d;
			this.next = null;
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
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null\n");
	}
	
	public Node merge(Node a, Node b) {
		Node dummy = new Node(0);
		Node tail = dummy;
		
		while(a != null && b != null) {
			if(a.data < b.data) {
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		
		if(a == null) {
			tail.next = b;
		} else {
			tail.next = a;
		}
		
		return dummy.next;
	}
	
	public static void main(String[] args) {
		MergeTwoSortedLinkedList mergeListA = new MergeTwoSortedLinkedList();
//		mergeListA.push(7);
		mergeListA.push(5);
		mergeListA.push(3);
		mergeListA.push(1);
		
		MergeTwoSortedLinkedList mergeListB = new MergeTwoSortedLinkedList();
		mergeListB.push(4);
		mergeListB.push(2);
		
		mergeListA.print();
		mergeListB.print();
		
		MergeTwoSortedLinkedList merge = new MergeTwoSortedLinkedList();
		merge.head = merge.merge(mergeListA.head, mergeListB.head);
		merge.print();
	}

}
