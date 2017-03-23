
public class Rectangle extends Shape {

	double w;
	double h;
	
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
		type = "Rectangle";
		System.out.println("Rectangle Created with (w,h)=("+w+","+h+")");
	}
	
	public double area() {
		return w*h;
	}
	
	
}
