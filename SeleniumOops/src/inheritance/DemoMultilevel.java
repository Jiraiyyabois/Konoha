package inheritance;

class EvenOdd
{
	int a = -2198;
	public void evod() 
	{
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else 
		{
			System.out.println("Odd");
		}
		
	}
	
}

class PositiveNegative extends EvenOdd

{
	public void posneg() 
	{
		if(a<0)
		{
			System.out.println("Negative");
		}
		else 
		{
			System.out.println("Positive");
		}
	} 
}

class Reverse extends PositiveNegative
{	int r = 0;
	public void reverse() 
{
	while(a!=0)
	{
		int d = a % 10 ;
		r = r * 10 + d;
		a = a / 10;
		
	}System.out.println(r);

	
	}
}

public class DemoMultilevel {

	public static void main(String[] args)
	{
		Reverse r = new Reverse();
		r.evod();
		r.posneg();
		r.reverse();
	}

}
//Accept 2 number from user and display which is 1 is greater ... swap the number ...
// and both number are equal or not
