package com.learning.singlylinkedlist;

//08 Program

public class DetectLoop {
	
	Node head ;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d ;
			next = null ;
		}
	}
	
	public void printList() {
		Node n = head ;
		
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public boolean detectLoopInLL() {
		Node slow = head ;
		Node fast = head ;
		
		while(fast != null && fast.next != null && slow != null) {
			fast = fast.next.next ;
			slow = slow.next ;
			
			if(slow == fast) {
				Node temp = getStartingNodeOfLoop(slow);
				System.out.println(temp.data + " is the starting point of the loop");
				System.out.println("No of nodes in loop : " + countNodes(slow));
				return true ;
			}
		}
		
		return false;
	}
	
	public Node getStartingNodeOfLoop(Node slow) {
		Node temp = head;
		while(temp != slow) {
			temp = temp.next;
			slow = slow.next;
		}
		return temp;
	}
	
	public void createALoopInLinkedList() {
		Node first = new Node(1) ;
		Node second = new Node(2) ;
		Node third = new Node(3) ;
		Node fourth = new Node(4) ;
		Node fifth = new Node(5) ;
		Node sixth = new Node(6) ;
		
		head = first ;
		first.next = second ;
		second.next = third ;
		third.next = fourth ;
		fourth.next = fifth ;
		fifth.next = sixth ;
		sixth.next = third ;
	}
	
	public int countNodes(Node slow) {
		Node current = slow ;
		int count = 1 ;
		
		while(current.next != slow) {
			count++ ;
			current = current.next ;
		}
		return count ;
	}

	public static void main(String[] args) {
		DetectLoop dl = new DetectLoop();
		dl.createALoopInLinkedList();		
//		dl.printList();
//		System.out.println();
		
		if(dl.detectLoopInLL()) {
			System.out.println("Loop Found");
		} else {
			System.out.println("No loop found");
		}
	}

}
