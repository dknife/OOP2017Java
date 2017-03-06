
public class ArrayTest {
	
	public static int[] makeArray(int size) {
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	public static void main(String[] argv) {
		int arr[][];
		
		int numArrays = 5;
		arr = new int[numArrays][];
		// create arrays with makeArray
		for(int i=0;i<arr.length;i++) {
			arr[i] = makeArray(i+1);
		}
		
		// compute the sum of all elements in arr
		int sum=0;
		for(int a[] : arr) 
			for( int e : a ) sum += e;			
		
		
		System.out.println("sum = " + sum);
	}

}
