import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_07_02_SwingLayouts extends JFrame {
	
	Ex2017_07_02_SwingLayouts() {
		setSize(300, 300);
		setTitle("이것은 나의 윈도");
		setLocation(100, 100);
		setLayout(null);
				
		JLabel l; JTextField t;
		l = new JLabel("이름");
		t = new JTextField("");
		l.setBounds(0,0, 50, 30);
		t.setBounds(50,0, 80, 30);
		add(l);
		add(t);
		
		l = new JLabel("나이");
		t = new JTextField("");
		l.setBounds(150,0, 50, 30);
		t.setBounds(200,0, 80, 30);
		add(l);
		add(t);
		
		l = new JLabel("주소");
		t = new JTextField("");
		l.setBounds(0,35, 50, 30);
		t.setBounds(50,35, 230, 30);
		add(l);
		add(t);
		
		l = new JLabel("특징");
		t = new JTextField("");
		l.setBounds(0,70, 50, 30);
		t.setBounds(50,70, 230, 30);
		add(l);
		add(t);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String []argv) {
		Ex2017_07_02_SwingLayouts f = new Ex2017_07_02_SwingLayouts();

	}

}
