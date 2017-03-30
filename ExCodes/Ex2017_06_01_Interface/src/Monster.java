
public class Monster implements Character, Chaser {
	int x;
	int y;
	
	// Character interface
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	// Chaser interface
	public void follow(int tx, int ty) {
		int dx = tx - x;
		int dy = ty - y;
		x += dx*0.2;
		y += dy*0.2;
	}

}
