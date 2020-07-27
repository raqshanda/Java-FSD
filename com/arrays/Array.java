package com.arrays;

import java.util.Arrays;

public class Array {
	private int[] items;
	private int count;

	public Array(int length) {
		setItems(new int[length]);
	}

	public void insert(int item) {
		getItems()[count++] = item;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(getItems()[i]);
		}
	}

	public void removeAt(int index) {
		if (index < 0 || index >= count - 1)
			throw new IllegalArgumentException();
		for (int i = index; i < count - 1; i++) {
			getItems()[i] = getItems()[i + 1];
		}
		count--;
	}

	public int indexOf(int item) {
		for (int i = 0; i < count; i++) {
			if (getItems()[i] == item)
				return i;
		}
		return -1;
	}

	public int[] getItems() {
		return items;
	}

	public void setItems(int[] items) {
		this.items = items;
	}

	
	
	

}
