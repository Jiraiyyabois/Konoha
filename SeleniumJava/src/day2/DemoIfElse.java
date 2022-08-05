package day2;

import java.util.Scanner;

public class DemoIfElse {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		sc.close();
		
		if(num%2==0)
		
		{
			System.out.println("Even number is " +  num);
		
		}
	
		else
			
		{
			System.out.println("Odd mumber is "  +   num);
		}
		

	}

}
