package inheritance;

public class ChildClass extends ParentClass
{
	public void childMethod() 
	{
		System.out.println("Content of Child Class");
	}
	

	public static void main(String[] args) 
	{
		ChildClass cc = new ChildClass();
		cc.parentMethod();
		cc.childMethod();
	
	}

}
