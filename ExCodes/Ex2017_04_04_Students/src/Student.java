
public class Student {
	String name;
	int ScoreE, ScoreP, ScoreM;
	
	public Student() {}
	public void setName(String s) { name = s; }
	public void setE(int score) { ScoreE = score; }
	public void setP(int score) { ScoreP = score; }
	public void setM(int score) { ScoreM = score; }
	public int getScore() { return ScoreE+ScoreP+ScoreM; }
}
