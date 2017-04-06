import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_07_03_Action extends JFrame {
	class myActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	Ex2017_07_03_Action() {
		setTitle("Action");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b = new JButton("Action");		
		myActionListener listener = new myActionListener();
		b.addActionListener(listener);
		add(b);
		setVisible(true);		
	}
	
	public static void main(String arg[]) {
		Ex2017_07_03_Action frame = new Ex2017_07_03_Action();
		
	}
}
