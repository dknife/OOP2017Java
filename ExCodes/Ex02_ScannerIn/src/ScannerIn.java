import java.util.*;
import java.lang.*;

public class ScannerIn {
	
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변과 높이의 길이를 입력하라: ");
		
		double len1 = scanner.nextDouble();
		double len2 = scanner.nextDouble();
		double anotherLen = Math.sqrt(len1*len1+len2*len2);
		scanner.close();
		
		System.out.print("작각삼각형 빗변의 길이 = ");
		System.out.println(anotherLen);
	}
}