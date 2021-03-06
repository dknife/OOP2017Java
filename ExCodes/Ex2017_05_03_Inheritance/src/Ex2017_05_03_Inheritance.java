
public class Ex2017_05_03_Inheritance {
	public static void main(String arg[]) {
		
		// impossible to instantiate abstract class
		//Shape a = new Shape();
		//System.out.println(a);
		
		Triangle b = new Triangle(1.5, 2.0);
		System.out.println(b);
		
		Rectangle c = new Rectangle(2.0, 3.0);
		System.out.println(c);
		
		Circle d = new Circle(1.5);
		System.out.println(d);
		
		Shape e = b;
		System.out.println(e);
		
		if(e instanceof Triangle) {
			Triangle f = (Triangle) e;
			System.out.println(f);
		}
		
	}
}
