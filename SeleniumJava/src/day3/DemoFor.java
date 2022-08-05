package day3;

public class DemoFor {

	public static void main(String[] args)
	{
		System.out.println("Ascending order");
		for(int i = 1; i<=5 ; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Descending order");	
		for(int i = 5; i>=1 ; i--)
		{
			System.out.println(i);
	    }
		System.out.println("A-z");
		for(char ch = 'a'; ch<='z' ; ch++)
		{
			System.out.println(ch);
	    }
		System.out.println("ASCII");
		for(int i = 1; i<=9 ; i++)
		{
			System.out.println(i);
	    }
	
	}
}
