package schein3todo;

import java.util.*;

public class TodoList {

	private String[] list;
	private boolean[] done;
	private int size;

	public void TodoList(String[] todos) {
		this.list = todos;
	}

	public void done(int i) {
		done[i] = true;

	}

	public String toString() {
		String str = "";
		for (int i = 0; i < this.list.length; i++) {
			str += this.list[i] + ", ";
		}
		return str.substring(0, str.length() - 2);

	}
	
	public class UndoneIterator {

	public boolean hasNext() {
		
		for(int i = 0; i < done.length; i++) {
			
		}

		return false;
	}

	public String[] getNext() {

		return null;
	}

	public Iterator <String> getIterator() {

		Iterator <String> i = Arrays.asList(list).iterator();
		return i;
	}
}
}
