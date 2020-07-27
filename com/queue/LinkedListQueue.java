package com.queue;

class Node
{
	int data;		
	Node next;		

	public Node(int data)
	{

		this.data = data;
		this.next = null;
	}
}

public class LinkedListQueue
{
	private static Node rear = null, front = null;

	
	public static int dequeue() 	
	{
		if (front == null) {
			System.out.print("\nQueue Underflow");
			System.exit(1);
		}

		Node temp = front;
		front = front.next;
		if (front == null) {
			rear = null;
		}

		int item = temp.data;
		return item;
	}

	public static void enqueue(int item) 
	{
		
		Node node = new Node(item);
		if (front == null) {

			front = node;
			rear = node;
		} else {
	
			rear.next = node;
			rear = node;
		}
	}

	public static int peek() {

		if (front != null) {
			return front.data;
		} else {
			System.exit(1);
		}

		return -1;
	}

	public static boolean isEmpty() {
		return rear == null && front == null;
	}
	public static void main(String[] args)
	{
		LinkedListQueue q = new LinkedListQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);

		System.out.printf("Front element is %d\n", q.peek());

		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();

		if (q.isEmpty()) {
			System.out.print("Queue is empty");
		} else {
			System.out.print("Queue is not empty");
		}
	}
}