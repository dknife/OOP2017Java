import java.util.Scanner;

public class Ex2017_03_02_arrayBasics {

	public static void main(String[] s) {
		
		Scanner in = new Scanner(System.in);
		float numbers[];
		
		System.out.print("How many numbers?");
		int nNumbers = in.nextInt();
		numbers = new float[nNumbers];
		for(int i=0;i<nNumbers;i++) {
			numbers[i] = in.nextFloat();
		}
		float sum = 0.0f; float max = numbers[0];
		for(int i=0;i<nNumbers;i++) {
			System.out.print(numbers[i]+" ");
			if(numbers[i]>max) max=numbers[i];
			sum += numbers[i];
		}
		System.out.println(" : average = " + sum/numbers.length);
		System.out.println(" : max = " + max);
		
		
	}
}
