
import java.util.*;
public class Ex2017_06_04_HashMap {
	
	public static void main(String arg[]) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		
		hMap.put("Kang",  "���");
		hMap.put("Kim", "��");
		
		String value = hMap.get("Kang");
		System.out.println(value);
	}

}
