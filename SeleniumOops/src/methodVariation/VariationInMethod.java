package methodVariation;

public class VariationInMethod {
	
	//method with void return type
	
	public void methodVoid() 
	{
	System.out.println("Method without paramenter and with void return type");	
	}
	
	//method with int return type must have a return value
	
	public int methodInt(int a) 
	{
		System.out.println("Method with int return type and parameter value=====>" + a);
		return a;
	}
	
	public double methodDouble(double a,double b) 
	{
		double c = a + b;
		System.out.println("Method with double return type & 2 2 parameter value ====>" + c);
		return c;
	}
	

	public static void main(String[] args) 
	{
	 VariationInMethod vm = new VariationInMethod();
	 vm.methodVoid();
	 vm.methodInt(03);
	 vm.methodDouble(03.04, 03.04);
	 
	}

}
