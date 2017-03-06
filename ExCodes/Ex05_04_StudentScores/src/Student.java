
public class Student {
	private String name;
	private int Korean;
	private int English;
	private int Math;
	
	public void setName(String n) {
		name = n;
	}
	public void setScore(int course, int score) {
		switch(course) {
		case 0 : Korean = score; break;
		case 1 : English = score; break;
		case 2 : Math = score; break;
		default: System.out.println("Invalid course ID");
		}
	}
	
	public int getTotalScore() {
		return Korean+English+Math;
	}
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println(name + ":" + Korean + "," + English + "," + Math);
	}

}
