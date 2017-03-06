
public class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle(double w, double h) {
		width = w; height = h;
	}
	
	public double Area() {
		return width*height;
	}
}