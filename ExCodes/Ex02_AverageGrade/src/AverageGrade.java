import java.util.*;
public class AverageGrade {
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		double kor, eng, math, sci;
		System.out.println("����, ����, ���, �ڿ��� ������ ���ʷ� �Է��Ͻÿ�");
		kor = sc.nextDouble();
		eng = sc.nextDouble();
		math = sc.nextDouble();
		sci = sc.nextDouble();
		
		// weight 0.3, 0.2, 0.4, 0.1
		double score = kor*0.3 + eng*0.2 + math*0.4 + sci*0.1;
		char grade;
		if(score>=90) grade='A';
		else if(score>=80) grade = 'B';
		else if(score>=70) grade = 'C';
		else if(score>=60) grade = 'D';
		else grade = 'F';
		
		System.out.print("ȯ����: ");
		System.out.println(score);
		System.out.print("����:");
		System.out.println(grade);
	}

}
