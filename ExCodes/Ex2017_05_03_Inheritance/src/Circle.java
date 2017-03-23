
public class Circle extends Shape {
	double radius;
	
	public Circle(double r) {
		super("Circle");
		radius = r;
		System.out.println("Circle Created with r="+radius);
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	
	
}
