
public class Ex2017_04_02_ArrayAnalyzer {
	public static void main(String[] args) {
		int iArray[] = {
				1, 5, 4, 9, -4, 2, 89, 2, 4, 9, 23, 1,
				5, 6, 7, 9, 2, 33, 45, 54
		};
		
		ArrayAnalyzer AA = new ArrayAnalyzer();
		AA.setArray(iArray);
		System.out.println("size: "+AA.getSize());
		System.out.println("avrg: "+AA.getAverage());
		System.out.println("max_: "+AA.getMax());
		System.out.println("min_: "+AA.getMin());
	}
}
