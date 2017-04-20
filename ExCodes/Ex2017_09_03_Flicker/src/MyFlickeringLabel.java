import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyFlickeringLabel extends JLabel implements Runnable {
	
	final int sec = 0;
	final int centiSec = 1;
	
	int type = 0;
	
	MyFlickeringLabel() {}
	MyFlickeringLabel(int _type) {
		type = _type;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			n++;
			if(type == centiSec && n>100) n-=100;
			else if(type == sec && n > 60) n-=60;
			this.setText(""+n);
			
			
			try{
				if(type == sec) Thread.sleep(1000);
				else Thread.sleep(10);
			}
			catch(InterruptedException e) { }
		}
	}
	

}
