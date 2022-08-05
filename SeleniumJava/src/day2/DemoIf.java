package day2;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		sc.close();
		
		if(age>18)
		{
			System.out.println("Age is greater than 18");
		}

	}

}
