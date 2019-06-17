package pong;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JTextArea;
import java.awt.*;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

@SuppressWarnings({ "serial", "unused" })
class napis extends JTextArea {
	 public napis() throws IOException {
	    List<wyswietlanie> wynika = new ArrayList<wyswietlanie>();
	    Scanner reader = new Scanner(new File("wyniki.txt"));
		String wczytane;
		int i=0, liczba=0, imie;
		String[] splitedArray = null;
	    while (reader.hasNext()) 
		{
			wczytane=reader.nextLine();	
			splitedArray = wczytane.split(" ");
	        wynika.add(new wyswietlanie(splitedArray[0], splitedArray[1], splitedArray[2], splitedArray[3]));
	    }
		Collections.sort(wynika, Collections.reverseOrder());
		for(wyswietlanie wyswietlanie : wynika) 
		{
			append(wyswietlanie.drukuj_liczba()+" : " + wyswietlanie.drukuj_liczba2() + "    " +wyswietlanie.drukuj_name()+ " " + wyswietlanie.drukuj_name2() + "\n" );
			liczba++;
			if(liczba==10)
			{
				break;
			}
		}
		reader.close();
	 }
	}