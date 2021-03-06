import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_07_05_PaneMouse extends JFrame {

	class MyMouseListener implements MouseListener {
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {
			JButton newLabel = new JButton("Hello");
			newLabel.setBounds(e.getX(), e.getY(), 100, 30);
			cPane.add(newLabel);
			cPane.updateUI();
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	}

	JPanel cPane;
	JLabel la;
	
	Ex2017_07_05_PaneMouse() {
		setTitle("Mouse and label");
		cPane = new JPanel();
		this.setContentPane(cPane);
		this.setLayout(null);
		this.setBounds(0, 0, 300, 300);
		
		
		la = new JLabel("Hello");
		la.setLocation(100,100);
		la.setSize(100,50);
		cPane.add(la);
		MyMouseListener l = new MyMouseListener();
		cPane.addMouseListener(l);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] argv) {
		Ex2017_07_05_PaneMouse f = new Ex2017_07_05_PaneMouse();
	}

}
