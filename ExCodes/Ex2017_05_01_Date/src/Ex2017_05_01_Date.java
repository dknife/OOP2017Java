import java.util.*;

public class Ex2017_05_01_Date {
	
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		MyDate date;
		date = new MyDate();
		
		while(true) {
			System.out.println("Your command:");
			System.out.println(" 1) Set Date");
			System.out.println(" 2) Next Day");
			System.out.println(" 3) Prev Day");
			System.out.println(" 4) Next N Days");
			System.out.println(" 5) Prev N Days");
			
					
			int command = scanner.nextInt();
			
			switch(command) {
			case 1:
				System.out.print("input year, month, and day");
				int y = scanner.nextInt();
				int m = scanner.nextInt();
				int d = scanner.nextInt();
				date.setDate(y, m, d);
				
				break;
			case 2: 
				date.nextDay(1);
				break;
			case 3: 
				date.prevDay(1);
				break;
			case 4: 
				System.out.print("How many days?");
				int n = scanner.nextInt();
				date.nextDay(n);
				break;
			case 5: 
				System.out.print("How many days?");
				n = scanner.nextInt();
				date.prevDay(n);
				break;
			default: break;
			}
			
			date.showDate();
		}
		
				
	}

}
