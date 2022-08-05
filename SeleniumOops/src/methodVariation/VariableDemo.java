package methodVariation;

//16 June 2021
//Demo of Instance, Local , Static Variable

//Local variable --> A variable which is declared inside the method

//Instance Variable -->A variable which is declared inside the class but outside the method

//Static variable ---> A variable that is declared as static


public class VariableDemo
{
	
	int a = 20;//instance variable
	static int b = 30;//static variable
	

	public void localVariable()
	{
		int c =10;//local variable
		System.out.println("local Variable--> " + c);
		
		
	}
			


	public static void main(String[] args)
	{
		VariableDemo vd = new VariableDemo();
		vd.localVariable();//calling of local variable
		System.out.println("Instance variable -----> " + vd.a);//instance variable
		System.out.println("Static Variable --->" + b);//static variable
	}

}
