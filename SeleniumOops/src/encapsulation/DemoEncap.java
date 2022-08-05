package encapsulation;

import java.util.Scanner;

class Salary
{
	private int bsal = 8000 ,ta ,da, pf;
	Scanner sc = new Scanner(System.in);
	
private void calbasic()
{
	System.out.println("Enter Choice HR--> 1 else Other--->0");
	int ch = sc.nextInt();
	
	if(ch==1)
	{
		System.out.println("salary of HR --->" + (bsal+ta+da+pf));
	}
	
	else
	{
		System.out.println("salary of other ---->"+ (bsal+pf));
	}
}

public void basic()
{
	System.out.println("TA");
	ta = sc.nextInt();
	System.out.println("DA");
	da = sc.nextInt();
	System.out.println("PF");
	pf = sc.nextInt();
	calbasic();
	
}
}
public class DemoEncap
{

	public static void main(String[] args)
	{
		Salary sal = new Salary();
		sal.basic();

	}

}

