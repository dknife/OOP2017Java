import java.util.Scanner;

public class Ex2017_09_01_SimpleThread{	
	
	public static void main(String[] arg) {
		
		Scanner myScanner = new Scanner(System.in);
	
		TimerThread th = new TimerThread();
		th.start();
		
		while(true) {
			
			String str = myScanner.next();
			System.out.println("your input : " + str);			
		}
	}
}
