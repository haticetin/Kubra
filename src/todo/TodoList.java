package todo;

import java.util.*;

public class TodoList {

	private String[] list;

	private boolean[] done;

	private int size;

	public TodoList(String[] todos) {
		this.list = todos;
		this.size = this.list.length;
		this.done = new boolean[size];
	}

	public void done(int i) {
		this.done[i] = true;
		this.list[i] = "(" + this.list[i] + ")";
	}

	@Override
	public String toString() {

		String str = "";

		for (int i = 0; i < this.list.length; i++) {
			str += this.list[i] + "\n";
		}

		return str;
	}

	public TodoList getIterator() {
		TodoList tl = new TodoList(this.list);
		Arrays.asList(this.list).iterator();
		return tl;
	}

	public class UndoneIterator {

		public String getNext() {

			if (hasNext()) {
				return getIterator().next();
			}

			throw new NoSuchElementException();

		}

		public boolean hasNext() {
			
			

			return false;
		}

	}

}
