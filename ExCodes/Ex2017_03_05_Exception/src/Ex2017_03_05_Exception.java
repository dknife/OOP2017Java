import java.util.*;
import java.io.*;

public class Ex2017_03_05_Exception {

	public static void main(String s[]) {
		
		Scanner scanner = new Scanner(System.in);
		int dividend = scanner.nextInt();
		int divisor = scanner.nextInt();
		InputStreamReader rd = new InputStreamReader(System.in);
		
		// try-catch-finally
		try {			
			System.out.println(dividend/divisor);
			int a = rd.read();
			System.out.println((char) a);
		}
		catch(ArithmeticException e) {
			System.out.println("Sorry, / by zero not allowed");
		}
		catch(IOException e) {
			System.out.println("Sorry, input error");
		}
		finally {
			System.out.println("Young-Min Kang");
		}
	}
}
