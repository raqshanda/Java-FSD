package com.stack;

public class TwoStacks {
	int array[];
	int head1,head2;
	public TwoStacks(int n) {
		array=new int[n];
		head1=-1;
		head2=array.length;
	}
	public boolean isFull1() {
		if(head2-head1<=1)
			return true;
		else
			return false;
	}
	public boolean isFull2() {
		if(head2-head1<=1)
			return true;
		else
			return false;
	}
	public void push1(int data) {
		if(head2-head1>1)
			array[++head1]=data;
		else
			System.out.println("Stack1 is full");
	}
	public void push2(int data) {
		if(head2-head1>1)
			array[--head2]=data;
		else
			System.out.println("Stack2 is full");
	}
	public int pop2() {
		if(head2<array.length)
			return array[head2++];
		else {
			System.out.println("Empty stack2");
			return 0;
		}
	}
	public int pop1() {
		if(head1>-1)
			return array[head1--];
		else {
			System.out.println("Empty stack1");
			return 0;
		}
	}
	public boolean isEmpty1() {
		return (head1==-1);
		
	}
	public boolean isEmpty2() {
		return (head2==(array.length));
	}
public static void main(String[] args) {
	TwoStacks obj=new TwoStacks(10);
	obj.push1(10);
	obj.push1(20);
	obj.push1(30);
	obj.push1(40);
	obj.push1(50);
	obj.push1(60);
	obj.push1(70);
	obj.push2(80);
	
	obj.isEmpty1();
	obj.isEmpty2();
	System.out.println("Popped:"+obj.pop1());
	System.out.println("Popped:"+obj.pop2());
	System.out.println("Stack1 full? "+obj.isFull1());
	obj.push2(90);
	obj.push2(100);
	obj.push2(110);
	obj.push2(120);
	System.out.println("Stack2 full? "+obj.isFull2());
}
}
