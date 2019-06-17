package pong;
import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.util.*;

@SuppressWarnings({ "serial", "unused" })

public class ScorePanel extends JFrame {

	public ScorePanel() {
		super("Wyniki");
		//setLocation(1200,500);
		setSize(300,400);
		setResizable(false);
		//setLocationRelativeTo(Tetris.okno);
		//setPreferredSize(new Dimension(300, 400));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
		Point newLocation = new Point (middle.x + (430 / 2), middle.y - (580 / 2));
		setLocation(newLocation);
		
		try
		{
			JTextArea napis = new napis();
			add(napis);
			//append("Test");
			napis.setEditable(false);
		}
		catch (IOException e) {
			System.out.println("Exception sie wyjeba³ " + e);
			//System.exit(0); 
		}
		//pack();
		setVisible(true);
	}
}