
// STACK
// push(element) : element�� ���ÿ� ����
// element pop() : ���� ���� element�� ��ȯ

public class Ex2017_06_03_GenericClass {
	
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		
		myStack.push("hello");;
		myStack.push("world");
		myStack.push("hello");
		myStack.push("java");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
