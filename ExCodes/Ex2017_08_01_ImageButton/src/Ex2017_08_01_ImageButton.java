import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_08_01_ImageButton extends JFrame {

	Ex2017_08_01_ImageButton() {
		// 1. title, size, location
		setTitle("Image Button");
		setBounds(0,0, 500, 500);
		// 2. set layout manager and exit operation
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// your components here
		ImageIcon img = new ImageIcon("images/buttonImage.jpg");
		ImageIcon rollOverImg = new ImageIcon("images/rollOver.jpg");
		ImageIcon pressedImg = new ImageIcon("images/pressed.png");
		
		JButton myButton = new JButton(img);
		myButton.setVerticalAlignment(SwingConstants.CENTER);
		myButton.setHorizontalAlignment(SwingConstants.CENTER);
		myButton.setRolloverIcon(rollOverImg);
		myButton.setPressedIcon(pressedImg);
		myButton.setBounds(20,20,300,300);
		add(myButton);
		
		
		// 3. make this frame visible
		setVisible(true);
	}
	public static void main(String[] s) {
		new Ex2017_08_01_ImageButton();
	}
}
