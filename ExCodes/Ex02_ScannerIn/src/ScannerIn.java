import java.util.*;
import java.lang.*;

public class ScannerIn {
	
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�غ��� ������ ���̸� �Է��϶�: ");
		
		double len1 = scanner.nextDouble();
		double len2 = scanner.nextDouble();
		double anotherLen = Math.sqrt(len1*len1+len2*len2);
		scanner.close();
		
		System.out.print("�۰��ﰢ�� ������ ���� = ");
		System.out.println(anotherLen);
	}
}