
public class Triangle extends Shape {
	
	double w;
	double h;
	
	public Triangle(double w, double h) {
		super("Triangle");
		this.w = w;
		this.h = h;
		System.out.println("Triangle Created with (w,h)=("+w+","+h+")");
	}
	
	public double area() {
		return 0.5*w*h;
	}
	

}
