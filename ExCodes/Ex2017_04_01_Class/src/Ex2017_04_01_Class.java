import java.util.*;

public class Ex2017_04_01_Class {
	public static void main(String[] s) {
		Scanner scanner = new Scanner(System.in);
		Person p[];
		System.out.print("How many persons?");
		int nPerson = scanner.nextInt();
		p = new Person[nPerson];
		for(int i=0;i<p.length; i++) {
			p[i] = new Person("Person_"+i);			
		}
		for(Person x : p) {
			System.out.println("Name: "+ x.getName());
		}
			
	}
}

