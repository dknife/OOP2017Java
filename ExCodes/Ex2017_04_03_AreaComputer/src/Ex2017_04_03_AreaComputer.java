
public class Ex2017_04_03_AreaComputer {

	public static void main(String []s) {
		
		AreaComputer computer = new AreaComputer();
		float r = 1.2f;
		System.out.println(
				"radius "+r+ ":"+ computer.areaCircle(r));
		float w = 1.2f;
		float h = 2.2f;
		System.out.println(
				"rectangle "+w+","+h+":"+ computer.areaRect(w,h));
		System.out.println(
				"triangle "+w+","+h+":"+ computer.areaTri(w,h));
	}
}
