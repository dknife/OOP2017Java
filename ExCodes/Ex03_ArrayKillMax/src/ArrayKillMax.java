import java.util.*;

public class ArrayKillMax {
	
	public static void killMax(int[] arr) {
		int max=arr[0];
		int loc = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				loc = i;
			}
		}
		arr[loc]=0;
	}
	
	public static void main(String[] arg) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int nData;
		int[] iArray;
		
		System.out.print("How many data items?");
		nData = myScanner.nextInt();
		
		iArray = new int[nData];
		
		System.out.print("Input data");
		for(int i=0 ; i < nData; i++) {
			iArray[i] = myScanner.nextInt();
		}
		
		killMax(iArray);
		
		for(int i=0;i<nData;i++) {
			System.out.print(iArray[i]);System.out.print("|");
		}
		System.out.println("");
		
		
		myScanner.close();
		
	}
	
}
