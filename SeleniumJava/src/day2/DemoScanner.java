package day2;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args)
	
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int a = sc.nextInt();
	sc.close();
	System.out.println("Accepted the value from scanner ="   +   a);
	
	}

}
