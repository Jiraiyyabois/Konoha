package day3;

import java.util.Scanner;

public class DemoDoWHile {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int num , sum= 0;
		System.out.println("Enter NUmber");
		
		
		do
		{
			num = sc.nextInt();
			sum = sum + num;
		}
		while(num!=0);
		sc.close();
			System.out.println("sum --->" + sum);
		

	}

}
