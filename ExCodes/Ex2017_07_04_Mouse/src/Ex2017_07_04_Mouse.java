import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_07_04_Mouse extends JFrame {
	
	class MyMouseListener implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	}
	
	Ex2017_07_04_Mouse() {
		setTitle("Mouse");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		JButton b = new JButton("Move you mouse over me");
		b.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		b.addMouseListener(listener);
		this.add(b);
				
		setVisible(true);
	}
	
	public static void main(String[] a) {
		Ex2017_07_04_Mouse f = new Ex2017_07_04_Mouse();
		
	}

}
