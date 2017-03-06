import java.io.*;

public class SystemIn {
	
	public static void main(String[] arg) {
		InputStreamReader rd = new InputStreamReader(System.in);
		
		System.out.println("input your string");
		try {
			while(true) {
				int c = rd.read();
				System.out.println((char)c);
			}
		}
		catch(IOException e) {
			System.out.println("Input Error");
		}
		System.out.println("Done");
	}
}
