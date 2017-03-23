
public class Ex2017_05_02_ValueAndReference {
	
	public static void increase(int a, AClass b) {
		a++;
		b.value++;
	}
	
	public static void main(String[] args) {
		int A=0;
		AClass B = new AClass();
		AClass C = new AClass();
		
		System.out.println(A);
		System.out.println(B.value);
		System.out.println(C.value);
		increase(A, B);
		increase(A, C);
		increase(A, C);
		increase(A, C);
		B = C;		
		System.out.println(A);
		System.out.println(B.value);
		System.out.println(C.value);
		
	}
}
