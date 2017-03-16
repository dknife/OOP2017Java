import java.util.Scanner;

public class Ex2017_03_04_IrregularArray {
	
	public static void main(String[] s) {
		int list[][];
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many lists?");
		list = new int[input.nextInt()][];
		
		for(int i=0;i<list.length;i++) {
			System.out.print("How many items for list "+i);
			list[i] = new int[input.nextInt()];
			for(int j=0; j<list[i].length; j++) {
				list[i][j] = input.nextInt();
			}
		}
		
		// output
		for( int[] l : list) {
			for( int item : l) {
				System.out.print(item+" ");
			}	System.out.println("");
		}
	}

}
