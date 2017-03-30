
// STACK
// push(element) : element를 스택에 삽입
// element pop() : 가장 위의 element를 반환

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
