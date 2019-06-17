package pong;
import javax.swing.*;

@SuppressWarnings("serial")
public class gra extends JFrame {
	
	public gra() {
		super("Pong");
		 
			JPanel panel = new test();
			add(panel);
			pack();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		
		}
	
	
	}	
