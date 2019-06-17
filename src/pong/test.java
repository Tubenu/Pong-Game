package pong;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.Timer;

@SuppressWarnings("serial")
public class test extends JPanel implements ActionListener,KeyListener{
	Timer t = new Timer(1, this);
	


	public test() {
		
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setPreferredSize(new Dimension(1300, 650));
		setBackground(Color.BLACK);
		
	}
int max = 3 ,min= -3;
int limit_gry = 4;
double x1= 10,y1=260 , x2 = 1250,y2=260 ,pilkax =650 , pilkay=325  , speedx =(Math.random() * ((max - min) + 1)) + min ,speedy=(Math.random() * ((max - min) + 1)) + min,xvel = 0 , yvel = 0,xxvel =0, yyvel = 0;
static int liczniklewa = 0;
static int licznikprawa= 0;

int koniec=0;
static String imie;
static String imie2;
int flag=0 ,flag2=0,flag88=0;


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.WHITE);
		g2d.fill(new Rectangle2D.Double(x1,y1, 40, 200));
		g2d.fill(new Rectangle2D.Double(x2,y2, 40, 200));
		g2d.fill(new Ellipse2D.Double(pilkax, pilkay, 35, 35));
		Font myFont = new Font ("Courier New", 1, 70);
		g.setFont (myFont);
		g.drawString(String.valueOf(licznikprawa), 520,100 );
		g.drawString(String.valueOf(liczniklewa), 750, 100);
		
		  JButton przycisk1 = new JButton("Restart");
		  JButton przycisk2 = new JButton("Wyjscie");
		  if (flag2==0)
		  {
			  add(przycisk1);
			  add(przycisk2);
			  flag2=1;
		  }
		  
		  przycisk1.setFocusable(false);
		  przycisk2.setFocusable(false);
		  przycisk1.setBackground(Color.WHITE);
		  przycisk2.setBackground(Color.WHITE);
		  przycisk1.setForeground(Color.BLACK);
		  przycisk2.setForeground(Color.BLACK);
		  przycisk1.setVisible(true);
		  przycisk2.setVisible(true);
		  
		 
		  przycisk1.addActionListener(new ActionListener() {
			    
				public void actionPerformed(ActionEvent e)
			    {
			  
			    	pilkax =650;
					pilkay=325;
					liczniklewa=0;
					licznikprawa=0;
					speedx=(Math.random() * ((max - min) + 1)) + min;
					speedy=(Math.random() * ((max - min) + 1)) + min;
					koniec=0;
					x1= 10;
					y1=260;
					x2 = 1250;
					y2=260;
					flag=0;
					//flag2=0;
			    }
			});
		 przycisk2.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e)
			    {
			    	
			    	System.exit(1);
			    }
			});
		
		if((liczniklewa == limit_gry  || licznikprawa == limit_gry) && flag==0 )
		{
					
			@SuppressWarnings("unused")
			okno_wynikow okienko = new okno_wynikow();
				if(liczniklewa == limit_gry && flag==0 )  
				{
		
					//g2d.fill(new Ellipse2D.Double(pilkax, pilkay, 35, 35));
					  speedx=0;
					  speedy=0;
					  koniec=1;
					  flag=1;
					  
				}
				
				
				else if (licznikprawa ==limit_gry && flag==0) {
					
					  speedx=0;
					  speedy=0;
					  koniec=1;
					  flag=1; 
				
				}
				
				else {
					t.start();
				}
				
		}
		if(liczniklewa == limit_gry) 
		{
			Font font = new Font ("Courier New",1,40);
			  
			  g2d.setFont(font);
			  g2d.setColor(Color.RED);
			  g2d.drawString("Gra skonczona wygral gracz Prawy !", 300, 150);
		}
		else if (licznikprawa == limit_gry)
		{
			Font font = new Font ("Courier New",1,40);
			  
			  g2d.setFont(font);
			  g2d.setColor(Color.RED);
			  g2d.drawString("Gra skonczona wygral gracz Lewy !", 300, 150);
		}
				 
				
	}
	
	public void actionPerformed (ActionEvent d) {
		
		if(pilkay<0 ||pilkay >610)
			speedy = -speedy;
		if(pilkax<0) {
			speedx = -speedx;
			liczniklewa++;
			pilkax =650;
			pilkay=325;
			speedx =(Math.random() * ((max - min) + 1)) + min;
			speedy=(Math.random() * ((max - min) + 1)) + min;
			
		}
			
		
		 if(pilkax >1260) {
			 
			 speedx = -speedx;
			 licznikprawa++;
			 pilkax =650;
			 pilkay=325;
			 speedx =(Math.random() * ((max - min) + 1)) + min;
			 speedy=(Math.random() * ((max - min) + 1)) + min;
		 }
		 
		pilkax -=speedx;
		pilkay +=speedy;
	    /*if(pilkax  >=x1 && pilkax <= x1 +40 )
	    {
	    	
	      if(pilkay>=y1 && pilkay <= y1 + 250)
	       {
	    	  speedx = -speedx;
	          //speedy = speedy;
	       }
	    }
	    
	    if( pilkax + 35>= x2 && pilkax +35<= x2+40)
	    {
	    	
	      if(pilkay>=y2 && pilkay <= y2 + 250)
	       {
	    	  speedx = -speedx;
	          //speedy = -speedy;
	       }
	    }*/
		
		if(y1 >450) {
			y1= 450;
			
				
		}
		else if(y1<0) {
			y1= 0;
			
		}
		
		y1 +=yvel;
		
		if(y2 >450) {
			y2= 450;
			
		}
		else if(y2<0) {
			y2= 0;
		
		}
		y2 +=yyvel;
		
		
		if(isIntersecting(pilkax, pilkay, 35, 35, x1, y1, 200, 40)) {
			speedx = -speedx;
			
		}
		
		if(isIntersecting(pilkax, pilkay, 35, 35, x2, y2, 200, 40)) {
			speedx = -speedx;
			
		}
		if(isIntersectingUp(pilkax, pilkay, 35, x2, y2, 40)) {
			speedy = -speedy;
		}
		
		if(isIntersectingUp(pilkax, pilkay, 35, x1, y1, 40)) {
			speedy = -speedy;
		}
		if(isIntersectingDown(pilkax, pilkay, 35, x2, y2, 40,200)) {
			speedy = -speedy;
		}
		
		if(isIntersectingDown(pilkax, pilkay, 35, x2, y2, 40,200)) {
			speedy = -speedy;
		}
		//stykaniekoncufkamilewa(pilkax, pilkay, 35, x1, y1, 40,250);
		//stykaniekoncufkamiprawa(pilkax, pilkay, 35, x2, y2, 40,250);
	
		repaint();
		 
	}
	
	public void up() {
		
		yvel = -2;
		
	}
	
	public void down() {
		yvel = 2;
		
		
	}
	
	public void up1() {
		
		yyvel = -2;
		
	}
	
	public void down1() {
		yyvel = 2;
		
		
	}

	public void keyPressed(KeyEvent gh) {
		int code = gh.getKeyCode();
		if(koniec==0)
		{
			if(code== KeyEvent.VK_W) {
			
			up();
		}
		if(code== KeyEvent.VK_S) {
			down();
		}
		if(code== KeyEvent.VK_UP) {
			up1();
		}
		if(code== KeyEvent.VK_DOWN) {
			down1();
		}
		}
		
	}
	public void keyTyped(KeyEvent e) {	
	}
	
	public void keyReleased(KeyEvent e) {	
	}
	
	
	boolean isIntersecting(double ballX, double ballY, double ballHeight, double ballWidth, double padX, double padY, double padHeight, double padWidth) {
		  return !(padX > ballX+ballWidth
			        || padX+padWidth < ballX
			        || padY > ballY+ballHeight
			        || padY+padHeight < ballY);
		}
		
		
	
	boolean isIntersectingUp(double ballX, double ballY, double ballHeight ,double padX, double padY, double padWidth) {
		double DeltaX,DeltaY;
		DeltaX = ballX - Math.max(padX, Math.min(ballX, padX + padWidth));
		DeltaY = ballY - Math.max(padY, Math.min(ballY, padY + padWidth));
		return (DeltaX * DeltaX + DeltaY * DeltaY) < (ballHeight/2 * ballHeight/2);
		
	 
	}
	
	boolean isIntersectingDown(double ballX, double ballY, double ballHeight ,double padX, double padY, double padWidth,double padHeight) {
		double DeltaX,DeltaY;
		padY=padY+padHeight-padWidth;
		DeltaX = ballX - Math.max(padX, Math.min(ballX, padX + padWidth));
		DeltaY = ballY - Math.max(padY, Math.min(ballY, padY + padWidth));
		return (DeltaX * DeltaX + DeltaY * DeltaY) < (ballHeight/2 * ballHeight/2);
	}
	void stykaniekoncufkamilewa(double ballX, double ballY, double ballHeight ,double padX, double padY, double padWidth,double padHeight) {
		double DeltaX,DeltaY;
		DeltaX = ballX - Math.max(padX, Math.min(ballX, padX + padWidth));
		DeltaY = ballY - Math.max(padY, Math.min(ballY, padY + padHeight));
		if ((DeltaX * DeltaX + DeltaY * DeltaY) < (ballHeight/2 * ballHeight/2)) {
			if(ballY>padY+padHeight) {
				speedy=-speedy;
			}
			if(ballY<padY) {
				speedy=-speedy;
			}
			if(ballX>padX+padWidth) {
				speedx=-speedx;
			}
		
			
		}
		
	}
	
}