import java.util.Scanner;
public class PrimeNumbers {
	
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		if(num<=3) return true;
		for(int i=2; i<= num-1; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("두 수를 입력하시오");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int nPrimes = 0;
		for(int i=num1; i<=num2; i++) {
			if(isPrime(i)) nPrimes++;
		}
		
		System.out.print("소수의 개수: ");
		System.out.println(nPrimes);
	}

}
