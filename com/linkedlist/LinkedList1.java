package com.linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

class Node{
	  int value;
		 Node next;
		public Node(int value) {
			this.value = value;
			next=null;
		}
		public boolean hasNext() {
	        return next != null;
	    }
		
	}
public class LinkedList1 {
	int length;
	Node head=null;
	Node slow;
    Node fast;
	public void printMiddle() {
	
		slow = head;
		fast = head;
	    while(fast.hasNext()&&fast.next.hasNext()) {
	    	fast=fast.next.next;
	    	slow=slow.next;      
	    }

	    
	    if(!fast.hasNext()){
	     System.out.println("The middle element is " + slow.value );
	    } else 
	    {
	     System.out.println("The middle elements are " +slow.value +","+ slow.next.value );
	    }


	    }
	    
	public void push(int value) {
		Node newNode=new Node(value);
		newNode.next=head;
		head=newNode;
	}
	boolean hasLoop() {
		slow=head;
		fast=head;
		int flag=0;
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList1 obj=new LinkedList1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Linked List:");
		int size=sc.nextInt();
		if(size<=0)
			throw new IllegalStateException("Size must be greater than 0");
		System.out.println("Enter "+size+" values");
		for(int i=0;i<size;i++) {
			obj.push(sc.nextInt());
		}
		obj.printMiddle();
		//var list=LinkedList.createWithLoop();
		System.out.println(obj.hasLoop());
	}

}
