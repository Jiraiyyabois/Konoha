package day2;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Choice");
	char ch = sc.next().charAt(0);

	System.out.println("Enter two number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	sc.close();
	
	switch (ch) {
	case '+':
		System.out.println("addition ---> " + (a+b));
		break;

	case '-':
		System.out.println("substraction ----> " + (a-b));
		break;
		
	case '*':
		System.out.println("Multiplication --->" + (a*b));
		break;
		
	case '/':
		System.out.println("Division --->" + (a/b));
		break;
	default:
		System.out.println("Invalid Choice");
		break;
	}
	
	}

}
