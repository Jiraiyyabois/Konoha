package day2;

public class DemoNestedIf {

	public static void main(String[] args)
	{
	int age = 28;
	int wt=60;
	if(age>18)
	{
		if(wt>50)
		{
			System.out.println("can donate blood");
		}
		else
		{
			System.out.println("cannot donate blood");
		}
	}
	else
	{
		System.out.println("age should be greater than 18");
	}
	}

}
