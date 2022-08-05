package methodVariation;

public class Methodstatic {
	
	//static is a  keyword ...... no need of creating an object & variable for calling the method 
	
	
	public static void methodvoidStatic() 
	{
		System.out.println("Static Method");
	} 

	public static void main(String[] args)
	{
		//methodvoidStatic();//calling by method name
		Methodstatic.methodvoidStatic();//calling by class name with method name
	}

}
