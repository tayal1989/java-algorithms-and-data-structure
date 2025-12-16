package com.learning.queue;

public class BasicQueueProgram {
	int front ;
	int rear ;
	int size ;
	int queue[] ;
	
	public BasicQueueProgram(int s) {
		queue = new int[s] ;
		front = 0 ;
		rear = 0 ;
		size = 0 ;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue got full");
		} else {
			queue[rear] = data ;
			rear++ ;
			size++ ;
		}
	}
	
	public void show() {
		for(int i = 0 ; i < size ; i++) {
			System.out.print(queue[front + i] + " ");
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue became empty");
			return -1 ;
		} else {
			int data = queue[front] ;
			front++ ;
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
		BasicQueueProgram q = new BasicQueueProgram(5) ;
		System.out.println("Is Queue Empty : " + q.isEmpty());
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(7);
		System.out.println("Is Queue Full : " + q.isFull());
		q.enqueue(3);
		q.enqueue(1);
		System.out.println("Size : " + q.getSize());
		System.out.println("Is Queue Full : " + q.isFull());
		q.enqueue(4);
		
		System.out.println("Elements Enqueued : ");
		q.show();
		
		System.out.println();
		q.dequeue();
		System.out.println("Elements After Dequeue : ");
		q.show();
		
		System.out.println();
		q.dequeue();
		System.out.println("Elements After Dequeue : ");
		q.show();
		System.out.println();
		
		System.out.println("Is Queue Empty : " + q.isEmpty());
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println("Is Queue Empty : " + q.isEmpty());
		
		q.dequeue();
	}

}
