
public class Circle extends Shape {
	double radius;
	
	public Circle(double r) {
		radius = r;
		type = "Circle";
		System.out.println("Circle Created with r="+radius);
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	
	
}
