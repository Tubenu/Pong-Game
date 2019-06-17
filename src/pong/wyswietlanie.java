package pong;

public class wyswietlanie implements Comparable<wyswietlanie> {
    public final String liczba_win;
    public final String name_win;
    public final String name_lose;
    public final String liczba_lose;
    
	wyswietlanie(String a, String b,String c,String d)
	{
		liczba_win=a;
		liczba_lose=b;	
		name_win=c;
		name_lose=d;
		
		
	}
	
	String drukuj_liczba()
	{
		return this.liczba_win;
		
	}
	
	String drukuj_liczba2()
	{
		return this.liczba_lose;
		
	}
	
	
	String drukuj_name()
	{
		return this.name_win;
		
	}
	String drukuj_name2()
	{
		return this.name_lose;
		
	}
	@Override
  public int compareTo(wyswietlanie o) {
    return Integer.compare(Integer.parseInt(liczba_win), Integer.parseInt(o.liczba_win));
  }
	
}