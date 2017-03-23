
abstract public class Shape {
	String type;
	
	public Shape() {
		type = "unknown";
		System.out.println("unknown shape created");
	}
	public Shape(String type) {
		this.type = type;
		System.out.println("shape: "+type+" created");
	}
	
	abstract public double area();
	
	public String toString() {
		String s = "shape:"+type+"  area:"+area();
		return s;
	}
}

