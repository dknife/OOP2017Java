public class Ex2017_04_04_Students {
	public static void main(String[] s) {
		Student []students = new Student[5];
		for(int i=0; i< students.length; i++) {
			students[i] = new Student();
			students[i].setName("std_"+i);
		}
		
		students[0].setE(45);
		students[0].setM(19);
		students[0].setP(29);
		
		students[1].setE(65);
		students[1].setM(89);
		students[1].setP(39);
		
		students[2].setE(45);
		students[2].setM(39);
		students[2].setP(59);
		
		students[3].setE(45);
		students[3].setM(19);
		students[3].setP(19);
		
		students[4].setE(55);
		students[4].setM(59);
		students[4].setP(39);
		
		// Best Student 찾아 출력
		// 학생의 이름과 점수 출력
		int maxScore = students[0].getScore();
		Student bestStudent = students[0];
		
		for( Student x : students) {
			System.out.println(x.name + ":" + x.getScore());
			if(x.getScore()>maxScore) {
				maxScore = x.getScore();
				bestStudent = x;
			}
		}
		
		System.out.println("Best Student = "+ bestStudent.name);
		
		
	}
}
