package encapsulation;

// class PrivateDemo
//{
//	private void methodPrivate()
//	{
//		System.out.println("NOte -Private method not accessible outside class");
//	}
//}

//Demo of Private Method
public class DemoPrivate
{
	
	private void privateMethod()
	{
		System.out.println("Demo of Private Method");
	}
	
	public static void main(String[] args) 
	{
		DemoPrivate dp = new DemoPrivate();
		dp.privateMethod();
//		PrivateDemo pd = new PrivateDemo();
//		pd.
	}
}

 