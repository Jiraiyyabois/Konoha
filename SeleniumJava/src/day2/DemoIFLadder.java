package day2;

import java.util.Scanner;

public class DemoIFLadder {

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Subject marks");
		int eng = sc.nextInt();
		int mat =sc.nextInt();
		int sci = sc.nextInt();
		sc.close();
		 
		int tot =eng+mat+sci;
		System.out.println("Total Number of Marks = " + tot);
		
		int avg = tot/3;
		System.out.println("Average Marks =" + avg);
			
		if(eng<35 || mat<35 || sci<35)
			
		{
			System.out.println("Fail");
			
		}
		
		else if(avg>75)
		{
			System.out.println("Distinction");
			
		}
			
		else if(avg>60)
		{
			System.out.println("First Class");
		}
		
		else if(avg>50)
		{
			System.out.println("second class");
		}
		
		else
		{
			System.out.println("Pass");
		}
	}
	
	

}
