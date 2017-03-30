
import java.io.*;

public class Ex2017_06_05_File {
	
	public static void main(String[] argv) {	
		
		try {
			
			FileInputStream fin = new FileInputStream(argv[0]);
			FileOutputStream fout = new FileOutputStream(argv[1]);
			int pass = Integer.parseInt(argv[2]);
			int c;
			while ( (c = fin.read())!= -1 ) {
				fout.write(c^pass);
			}
			
			fin.close();
			fout.close();
		
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		catch(IOException e) {
			System.out.println("IO Error");
		}
		
		
	}

}
