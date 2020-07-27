package com.stack;

import java.util.LinkedList;
import java.util.Queue;

class StackWithTwoQueues {

    Queue<Integer> q1;
    Queue<Integer> q2;
    int size = 0;
    public StackWithTwoQueues() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();

    }
    public void push(int x) {
        q1.add(x);
        size ++;
    }

   public int pop() {
        isNotEmpty2();
        int poppedEle = q1.remove();
        size--;
        swapQueues();
        return poppedEle;
    }
    public int peek() {
        isNotEmpty2();
        int peekedEle = q1.remove();
        q2.add(peekedEle);
        swapQueues();
        return peekedEle;
    }
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();

    }

    // move all elements from q1 to q2 except last element 
    public void isNotEmpty2() {
        for(int i=0; i<size-1; i++) {
            q2.add(q1.remove());
        }
    }

   @Override
	public String toString() {
		return "StackWithTwoQueues [q1=" + q1 + ", q2=" + q2 + ", size=" + size + "]";
	}
public void swapQueues() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public static void main(String[] args) {
		StackWithTwoQueues obj=new StackWithTwoQueues();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		System.out.println(obj);
		System.out.println("Top:"+obj.peek());
		obj.push(40);
		System.out.println("Popping:"+obj.pop());
		System.out.println("Is empty? "+obj.empty());
	}
}