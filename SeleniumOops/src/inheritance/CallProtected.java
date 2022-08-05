package inheritance;
//demo of calling protect modifier outside the package
import encapsulation.DemoProtect;

public class CallProtected extends DemoProtect {

	public static void main(String[] args)
	{
		CallProtected cp = new CallProtected();
		// dp.protectmethod() ----  method cannot accessible as it is in different(encapsulation) package with 'protected' access modifier
		cp.protectMethod(); //method is accessible cause we are inheriting class with protect access modifier {refer defn of Protected access modifier}
	}

}
