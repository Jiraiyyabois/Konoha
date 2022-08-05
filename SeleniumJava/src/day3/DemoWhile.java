package day3;

import java.util.Scanner;

public class DemoWhile {

	public static void main(String[] args)
	
	
	{
		
		
	System.out.println("Enter Number");
	Scanner Sc = new Scanner(System.in);
	int num = Sc.nextInt(), r = 0 ,t = num;
	
	while(num!=0)
	{
		int d = num%10;
		r=r*10 + d;
		num = num /10 ;
		
	}
	Sc.close();
	System.out.println(r);
	{
		if(t==r)
		{
			System.out.println("palindrome");
			
		}
		else 
		{
			System.out.println("not palindrome");
		}
	}
	
	}

}
