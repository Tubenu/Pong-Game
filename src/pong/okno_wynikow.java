package pong;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;


@SuppressWarnings("serial")
public class okno_wynikow extends JFrame {

	public okno_wynikow() {
		super("Zapisy wynikow");
		 
		//JPanel panel1 = new JPanel ();
		
		
		setLayout(null);
		//pack();
		setBackground(Color.BLACK);
		setLayout(new GridLayout(3,1, 1, 1));
		Font myFont = new Font ("Courier New", 1, 25);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//panel1.setOpaque(false);
		setSize(200,250);
		setBackground(Color.WHITE);
		
		//wygrany jest na gorze
		
		JTextField imieField = new JTextField();
		imieField.setBounds(175, 1, 50, 50);
		imieField.setForeground(Color.BLACK);
		//imieField.setBackground(Color.BLACK);
		imieField.setVisible(true);
		
		JTextField imieField1 = new JTextField();
		imieField1.setBounds(1, 1, 50, 50);
		imieField1.setForeground(Color.BLACK);
		//imieField1.setBackground(Color.BLACK);
		imieField1.setVisible(true);
		
		JButton Zapisz = new JButton ("Zapisz");
		Zapisz.setBounds(100, 0, 50, 50);
		Zapisz.setVisible(true);
		Zapisz.setBackground(Color.WHITE);
		imieField1.setFont(myFont);
		imieField.setFont(myFont);
		Zapisz.setFont(myFont);
		add(imieField1);
		add(Zapisz);
		add(imieField);
		
		
		
		Zapisz.addActionListener(new ActionListener() 
		  {
			    public void actionPerformed(ActionEvent e)
			    {
			    	System.out.println("Zapisano :D");
			    	imieField.setFocusable(true);
					Zapisz.setFocusable(true);
					imieField1.setFocusable(true);
					dispose();
			    	test.imie = imieField.getText();
			    	test.imie2 = imieField1.getText();
					try 
					{
						if(test.licznikprawa> test.liczniklewa)
						wynik.Wynik(test.licznikprawa, test.imie.toString(),test.liczniklewa,test.imie2.toString());
						else
							wynik.Wynik(test.liczniklewa, test.imie.toString(),test.licznikprawa,test.imie2.toString());
					} catch (FileNotFoundException e1) 
					{
						
						e1.printStackTrace();
					}
					
					
			    }
		  
			  
		  });
		
		
		
		
	}
}
