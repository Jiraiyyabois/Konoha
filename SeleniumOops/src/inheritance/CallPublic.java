package inheritance;
//demo of calling public modifier outside the package
import encapsulation.DemoPublic;

public class CallPublic {

	public static void main(String[] args)
	{
		DemoPublic dp = new DemoPublic();
		dp.publicMethod();

	}

}
