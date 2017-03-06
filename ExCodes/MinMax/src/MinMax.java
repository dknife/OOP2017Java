
public class MinMax {
	
	public static void main(String[] arg) {
		if(arg.length < 3) {
			System.out.println("arguments missing");
			return;
		}
		
		int value = Integer.parseInt(arg[1]);
		
		if(arg[0].equals("min")) {
			for(int i=1; i<arg.length; i++) {
				int tVal = Integer.parseInt(arg[i]);
				if(tVal<value) value = tVal;  
			}
			System.out.println("min = " + value);
		}
		else if(arg[0].equals("max")) {
			for(int i=1; i<arg.length; i++) {
				int tVal = Integer.parseInt(arg[i]);
				if(tVal>value) value = tVal;  
			}
			System.out.println("max = " + value);
		}
		else {
			System.out.println("min or max should be indicated");
		}
	}

}
