
public class Arrays {
	int[] items;
	private int count;
	public Arrays(int length) {
		items = new int[length];
	}
	public void insert(int item) {
		items[count++] = item;
	}
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}
	public void removeAt(int index) {
		if(index < 0|| index>=count-1)
			throw new IllegalArgumentException();
		for(int i=index; i<count-1;i++) {
			items[i] = items[i+1];
		}
		count--;
	}
	public int indexOf(int item) {
		for(int i=0;i<count;i++){
			if(items[i]==item)
			return i;
		}
		return -1;
	}

}
