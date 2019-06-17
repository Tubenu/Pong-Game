package pong;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class start {

	public static void main(String[] args) {
		
	JFrame okno = new JFrame();
	JButton przycisk1 = new JButton("Zagraj");
	JButton przycisk2 = new JButton("Hall of Fame");
	JButton przycisk3 = new JButton("Wyjdz");
	JPanel panel = new JPanel();
	
	
	okno.setSize(500,500);
	okno.setTitle("Menu");
	okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel.setBackground(Color.BLACK);
	panel.setLayout(new GridLayout(3,1, 150, 150));
	
	
	przycisk1.setBorder(null);
	przycisk1.setContentAreaFilled(false);
	przycisk2.setBorder(null);
	przycisk2.setContentAreaFilled(false);
	przycisk3.setBorder(null);
	przycisk3.setContentAreaFilled(false);
	
	przycisk1.setBackground(Color.black);
	przycisk2.setBackground(Color.black);
	przycisk3.setBackground(Color.black);
	
	przycisk1.setFont(new Font("Arial", Font.PLAIN, 40));
	przycisk2.setFont(new Font("Arial", Font.PLAIN, 40));
	przycisk3.setFont(new Font("Arial", Font.PLAIN, 40));
	
	przycisk1.setForeground(Color.WHITE);
	przycisk2.setForeground(Color.WHITE);
	przycisk3.setForeground(Color.WHITE);
	
	przycisk3.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e)
	    {
	       okno.dispose();
	       
	    }
	});
	
	przycisk1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e)
	    {
	      new gra();
	     
	    }
	    
	});
	przycisk2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e)
	    {
	      
	    @SuppressWarnings("unused")
		ScorePanel wyniki = new ScorePanel();
	     
	    }
	    
	});
	
	okno.add(panel);
	panel.add(przycisk1);
	panel.add(przycisk2);
	panel.add(przycisk3);
	
	przycisk1.setVisible(true);
	przycisk2.setVisible(true);
	przycisk3.setVisible(true);
	okno.setVisible(true);
	panel.setVisible(true);
	

	}

}
