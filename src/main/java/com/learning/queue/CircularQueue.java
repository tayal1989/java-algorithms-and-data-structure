package com.learning.queue;

public class CircularQueue {
	int front ;
	int rear ;
	int size ;
	int queueSize ;
	int queue[] ;
	
	public CircularQueue(int s) {
		queue = new int[s] ;
		queueSize = s ;
		front = 0 ;
		rear = 0 ;
		size = 0 ;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue got full");
		} else {
			queue[rear] = data ;
			rear = ((rear + 1) % queueSize) ;
			size++ ;
		}
	}
	
	public void show() {
		for(int i = 0 ; i < size ; i++) {
			System.out.print(queue[((front + i) % 5)] + " ");
		}
		
		System.out.println();
		
		for(int n : queue) {
			System.out.print(n + " ");
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue became empty");
			return -1 ;
		} else {
			int data = queue[front] ;
			front = ((front + 1) % 5) ;
			size-- ;
			return data ;
		}
	}
	
	public int getSize() {
		return size ;
	}
	
	public boolean isEmpty() {
		return getSize() == 0 ;
	}
	
	public boolean isFull() {
		return queue.length == getSize() ;
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5) ;
		
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(7);
		q.enqueue(3);
		q.enqueue(1);
		
		q.dequeue();
		q.dequeue();
		
		System.out.println("Elements : ");
		q.show();
		System.out.println();
		
		q.enqueue(9);
		q.enqueue(6);
		
		System.out.println("Elements : ");
		q.show();
		System.out.println();
	}

}
