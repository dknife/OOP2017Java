import java.util.Scanner;

public class Ex2017_03_03_ForEach {

	public static void main(String[] s) {
		
		Scanner in = new Scanner(System.in);
		float numbers[];
		
		System.out.print("How many numbers?");
		int nNumbers = in.nextInt();
		numbers = new float[nNumbers];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = in.nextFloat();
		}
		float sum = 0.0f; float max = numbers[0];
		for(float n : numbers) {
			System.out.print(n+" ");
			if(n>max) max=n;
			sum += n;
		}
		System.out.println(" : average = " + sum/numbers.length);
		System.out.println(" : max = " + max);

	}
}
