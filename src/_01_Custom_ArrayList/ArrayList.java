package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] h;
	public ArrayList() {
		h = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc>=h.length&&loc<=h.length) {
			throw new IndexOutOfBoundsException();
		}
		return h[loc];
	}
	
	public void add(T val) {
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return h.length;
	}
}