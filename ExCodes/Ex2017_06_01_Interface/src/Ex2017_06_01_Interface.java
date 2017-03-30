import java.util.*;

interface Character {
	void setLocation(int x, int y);
	int getX();
	int getY();
}

interface Controllable {
	void move(int command);
}

interface Chaser {
	void follow(int x, int y);
}



public class Ex2017_06_01_Interface {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player p = new Player();
		Monster m = new Monster();
		
		p.setLocation(100, 100);
		m.setLocation(0,50);
		
		while(true) {
			int px = p.getX();
			int py = p.getY();
			int mx = m.getX();
			int my = m.getY();
			System.out.println("player at"+px+","+py);
			System.out.println("monster at"+mx+","+my);
			
			System.out.println("player move (1-up,2-down,3-left,4-right)");
			int moveCommand = scanner.nextInt();
			p.move(moveCommand);
			m.follow(px, py);
		}
	}

}
