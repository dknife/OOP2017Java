
public class Overloading {
	
	public static void main(String[] arg) {
		Circle cir1 = new Circle(2.0);
		Circle cir2 = new Circle(3.0);
		Rectangle rect1 = new Rectangle(1.3, 10);
		Rectangle rect2 = new Rectangle(2.1, 3.1);
		
		System.out.println(cir1.toString() + " cir1 Area = " + cir1.Area());
		System.out.println(cir2.toString() + " cir2 Area = " + cir2.Area());
		System.out.println(rect1.toString() + " rect1 Area = " + rect1.Area());
		System.out.println(rect2.toString() + " rect2 Area = " + rect2.Area());
		
		// AreaSum (obj1, obj2)
		System.out.println("cir1  + cir2  = " + Overloading.AreaSum(cir1,cir2));
		System.out.println("cir1  + rect1 = " + Overloading.AreaSum(cir1,rect1));
		System.out.println("rect2 + cir2  = " + Overloading.AreaSum(rect2,cir2));
		System.out.println("rect1 + rect2 = " + Overloading.AreaSum(rect1,rect2));
		
		int a = 1; int b = 2; double c = 3.0; double d = 4.0;
		System.out.println(a + "+" + b + "=" + getSum(a,b));
		System.out.println(a + "+" + c + "=" + getSum(a,c));
	}
	
	static int getSum(int a, int b) { 
		System.out.println("ii");
		return a + b; 
	}
	static double getSum(double a, double b) { 
		System.out.println("dd");
		return a + b;  
	}
	
	static double AreaSum(Circle a, Circle b) {
		return a.Area() + b.Area();
	}
	static double AreaSum(Circle a, Rectangle b) {
		return a.Area() + b.Area();
	}
	static double AreaSum(Rectangle a, Circle b) {
		return a.Area() + b.Area();
	}
	static double AreaSum(Rectangle a, Rectangle b) {
		return a.Area() + b.Area();
	}

}
