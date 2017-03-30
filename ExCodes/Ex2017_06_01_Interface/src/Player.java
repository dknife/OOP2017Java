
class Player implements Character, Controllable {
	private int x;
	private int y;
	
	// Character interface
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	// Controllable interface 
	public void move(int command) {
		switch(command) {
		case 1: y++; break;
		case 2: y--; break;
		case 3: x++; break;
		case 4: x--; break;
		}
		
	}
}