package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] h;
	public ArrayList() {
		h = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return h[loc];
	}
	
	public void add(T val) {
		T[] add = (T[])new Object[h.length + 1];
		for (int i = 0; i < h.length; i++) {
			add[i] = h[i];
		}
		add[add.length - 1] = val;
		h = add;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] insert = (T[])new Object[h.length + 1];
		for (int i = 0; i < loc; i++) {
			insert[i] = h[i];
		}
		insert[loc] = val;
		for(int i = loc+1; i < insert.length; i++) {
			insert[i] = h[i-1];
		}
		
		h = insert;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		h[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] remove = (T[]) new Object[h.length-1];
		for(int i = 0; i < loc; i++) {
			remove[i] = h[i];
		}
		for(int i = loc+1; i < h.length; i++) {
			remove[i-1] = h[i];
		}
		
		h = remove;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < h.length; i++) {
			if(h[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return h.length;
	}
}