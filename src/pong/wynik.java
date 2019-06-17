package pong;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class wynik{
	  static void Wynik(int wynik, String name,int wynik1,String name1) throws FileNotFoundException{
	        List<String> zap = new ArrayList<String>();
		  File file = new File("wyniki.txt");
			Scanner in = new Scanner(file);
			String zdanie;
			
			while(in.hasNextLine()==true)
			{
				zdanie = in.nextLine();
				zap.add(zdanie);
			}
			PrintWriter zapis = new PrintWriter("wyniki.txt");  
			//
			for (String p : zap)
			{
				zapis.println(p);
			}
			if(name==null)
				name="anonymous";
			zapis.println(wynik+" "+wynik1+ " " +name +" "+name1);
			zapis.close();
			in.close();
	  } 
	}