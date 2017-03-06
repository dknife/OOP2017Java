
import java.util.Scanner;

public class Program {

	public static void main(String[] arg) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("how many students? ");
		int nStudents = myScanner.nextInt();

		Student student[] = new Student[nStudents];
		
		for(int i=0;i<nStudents; i++) {
			student[i] = new Student();
			System.out.print("이름: "); student[i].setName(myScanner.next());
			System.out.print("국어: "); student[i].setScore(0, myScanner.nextInt());
			System.out.print("영어: "); student[i].setScore(1, myScanner.nextInt());
			System.out.print("수학: "); student[i].setScore(2, myScanner.nextInt());
		}
		
		Student bestStudent = student[0];
		Student worstStudent = student[0];
		for(Student s : student) {
			if ( s.getTotalScore() > bestStudent.getTotalScore() ) {
				bestStudent = s;
			}
			if ( s.getTotalScore() < worstStudent.getTotalScore() ) {
				worstStudent = s;
			}
		}
		System.out.println("Best Student = " + bestStudent.getName());
		System.out.println("Worst Student = " + worstStudent.getName());
	}
}
