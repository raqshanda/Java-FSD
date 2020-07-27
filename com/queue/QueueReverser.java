package com.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
	public static Queue<Integer> reverse(Queue<Integer> q, int k)
    {
      Stack<Integer> stk=new Stack<Integer>();
      int temp=k;
      int size=q.size();
      while(--temp>=0)
      {
          stk.push(q.remove());
          
      }
      while(!stk.isEmpty())
      {
          q.add(stk.pop());
      }
      temp=size-k;
      while(temp-->0)
      {
          q.add(q.remove());
      }
      return q;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		reverse(queue,3);
		System.out.println(queue);
	}

}
