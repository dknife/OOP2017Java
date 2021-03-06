import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_08_02_CheckBox extends JFrame {
	
	Ex2017_08_02_CheckBox() {
		// 1. title, size, location
		setTitle("Image Button");
		setBounds(0,0, 500, 500);
		// 2. set layout manager and exit operation
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox box1 = new JCheckBox("���");
		add(box1);
		JCheckBox box2 = new JCheckBox("��", true);
		add(box2);
		ImageIcon image = new ImageIcon("images/pressed.png");
		ImageIcon selIcon = new ImageIcon("images/selected.jpg");
		JCheckBox box3 = new JCheckBox(image, true);
		box3.setSelectedIcon(selIcon);
		add(box3);
		
		// 3. make this frame visible
		setVisible(true);
	}
	
	public static void main(String[] s) {
		new Ex2017_08_02_CheckBox();
	}

}
