import java.util.*;

public class Ex2017_06_02_Generic {
	
	public static void main(String[] args) {
		Vector<Double> myVector = new Vector<Double>();
		
		myVector.add(1.4);
		myVector.add(2.4);
		myVector.add(3.4);
		myVector.add(4.4);
		
		myVector.remove(3.4);
		
		Iterator<Double> it = myVector.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		
		Vector<String> strVector = new Vector<String>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {			
			String inputStr = scanner.next();
			if(inputStr.equals("end")) break;
			else strVector.add(inputStr);
		}
		
		while(strVector.remove("kang"));
		
		Iterator<String> itStr = strVector.iterator();
		while(itStr.hasNext()) 
			System.out.println(itStr.next());

	}
}
