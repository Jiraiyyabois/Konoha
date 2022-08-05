package inheritance;

import java.util.Scanner;

public class CallCalculation extends Calculation
{
	public void sub() 
	{
		System.out.println("Substraction---->" + (a-b));
	}
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		CallCalculation cc = new CallCalculation();
		System.out.println("Enter 2 number");
		cc.a = sc.nextInt();
		cc.b = sc.nextInt();
		sc.close();
		cc.add();cc.sub();
				
	}

}

//Accept from user and display number is positive or negative & even or odd by implementing 
//Single Inheritance Concept
