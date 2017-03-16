public class ArrayAnalyzer {
	int[] array;
	
	// constructor
	public ArrayAnalyzer() {
		
	}
	
	public void setArray(int []a) { array = a; }
	public int getSize() {
		return array.length;
	}
	
	public float getAverage() {
		float sum = 0.0f;
		for(int x : array) sum+= x;
		return sum/array.length;
	}
	
	public int getMax() {
		int max = array[0];
		for(int x : array) if(x>max) max=x;
		return max;
	}
	
	public int getMin() {
		int min = array[0];
		for(int x : array) if(x<min) min=x;
		return min;		
	}
}
