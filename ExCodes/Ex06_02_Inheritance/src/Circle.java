
public class Circle extends Shape{
	double radius;
	
	public Circle(double r) {
		radius = r;
	}
	public double Area() {
		return 3.14*radius*radius;		
	}
}