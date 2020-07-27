package com.arrays;

import java.util.Arrays;

public class ArrayDemo extends Array{
	public ArrayDemo(int length) {
		super(length);
		//int[] items = new int[length];
	}
	public static void intersect(ArrayDemo obj1,ArrayDemo obj2) {
		int items1[]=obj1.getItems();
		int items2[]=obj2.getItems();
		int range=items1.length;
		int k=0;
		int result[]=new int[range];
		for(int i=0;i<items1.length;i++) {
			for(int j=0;j<items2.length;j++) {
				if(items1[i]==items2[j]) {
					result[k]=items1[i];
					k++;
					}
			}
		}
		System.out.println("Common items are:");
		for(int l=0;l<k;l++)
			System.out.println(result[l]);
	}
	public void insertAt(int item,int index) {
		for(int i=getItems().length-1;i>index;i--) {
			getItems()[i]=getItems()[i-1];
		}
		getItems()[index]=item;
	}
	public int max() {
		int max=getItems()[0];				//1
		for(int i=0;i<getItems().length;i++)	//n
		{
			if(getItems()[i]>max)			//n
				max=getItems()[i];			//n
		}
		return max;
	}
	public int[] reverse() {
		int[] reversed=new int[getItems().length];
		System.out.println("Reversed Array :");
		for(int i=0;i<getItems().length;i++) {
			reversed[i]=getItems()[getItems().length-1-i];
			//System.out.println(reversed[i]);
			
		}
		setItems(reversed);
		return getItems();
		//
		
	}
	
	
	public static void main(String[] args) {
		ArrayDemo obj1=new ArrayDemo(5);
		ArrayDemo obj2=new ArrayDemo(5);
		obj1.insert(10);
		obj1.insert(20);
		obj1.insert(1000);
		obj1.insert(70);
		obj1.insert(50);
		System.out.println("First Array");
		obj1.print();
		System.out.println("max: "+obj1.max());
		obj2.insert(10);
		obj2.insert(20);
		obj2.insert(100);
		obj2.insert(50);
		obj2.insert(5);
		System.out.println("Second array");
		obj2.print();
		intersect(obj1,obj2);
		System.out.println(Arrays.toString(obj1.reverse()));
		obj1.insertAt(30, 1);
		System.out.println("After inserting:");
		obj1.print();
	}

}
