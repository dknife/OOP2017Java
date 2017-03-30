
public class Stack {
	int[] array;
	int top;
	
	Stack() {
		array = new int[10];
		top = 0;
	}
	
	boolean isEmpty() { return top==0; }
	boolean isFull() { return top==10; }
	
	public void push(int v) {
		if(isFull()) return;
		array[top] = v;
		top++;
	};
	public int pop() {
		top--;
		return array[top];		
	};

}
