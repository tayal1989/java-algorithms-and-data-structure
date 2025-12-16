package com.learning.singlylinkedlist;

//13 Program

public class PallindromeInLL {
	static Node head ;
	
	static class Node {
		int data ;
		Node next ;
		
		Node(int d) {
			data = d ;
			next = null ;
		}
	}
	
	public void printList(Node head) {
		Node n = head ;
		while(n != null) {
			System.out.print(n.data + " --> ");
			n = n.next ;
		}
	}
	
	public boolean isPallindrome() {
		Node slow = head ;
		Node fast = head ;
		
		while(fast != null && fast.next != null) {
			slow = slow.next ;
			fast = fast.next.next ;
		}
		
		fast = head ;
		slow = reverseLinkedList(slow) ;
		
		while(slow != null) {
			if(slow.data != fast.data) {
				return false ;
			}
			slow = slow.next ;
			fast = fast.next ;
		}
		
		return true ;
	}
	
	public Node reverseLinkedList(Node head) {
		Node current = head ;
		Node previous = null ;
		Node next = null ;
		
		while(current != null) {
			next = current.next ;
			current.next = previous ;
			previous = current ;
			current = next ;
		}
		
		head = previous ;
		return previous ;
	}

	public static void main(String[] args) {
		PallindromeInLL ll = new PallindromeInLL();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
//		Node fourth = new Node(3);
		Node fourth = new Node(2);
		Node fifth = new Node(1);
		
		head = first ;
		first.next = second ;
		second.next = third ;
		third.next = fourth ;
		fourth.next = fifth ;
//		fifth.next = sixth ;
		
		ll.printList(head);
		System.out.println();
		
		System.out.println(ll.isPallindrome());
	}

}
