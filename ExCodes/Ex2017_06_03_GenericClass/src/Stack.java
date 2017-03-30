
public class Stack <T> {
	Object[] array;
	int top;
	final int MAX = 1024;
		
	Stack() {
		array = new Object[MAX];
		top = 0;
	}
	
	boolean isEmpty() { return top==0; }
	boolean isFull() { return top==MAX; }
	
	public void push(T v) {
		if(isFull()) return;
		array[top] = v;
		top++;
	};
	public T pop() {
		if(isEmpty()) return null;
		top--;
		return (T) array[top];		
	};

}
