import java.util.Scanner;

public class Ex2017_09_02_Runnable {
	public static void main(String[] arg) {
		
		Scanner myScanner = new Scanner(System.in);
	
		TimerRunnable trunnable = new TimerRunnable();
		Thread th = new Thread(trunnable);
		th.start();
		
		while(true) {
			
			String str = myScanner.next();
			System.out.println("your input : " + str);			
		}
	}
}
