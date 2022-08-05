package day4;

import java.util.Scanner;

public class DemoArray3 {

	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Size of array");
	int size = sc.nextInt();
	int a[] = new int[size];
	
	System.out.println("Enter the number");
	for(int i=0;i<size;i++)
	{
		a[i] = sc.nextInt();
		
	}
	
	System.out.println("Display");
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
		
	System.out.println("Reverse");
	for(int i=size-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	
	
	}

}
