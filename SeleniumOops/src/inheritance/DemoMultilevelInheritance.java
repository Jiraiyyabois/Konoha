package inheritance;
//Multilevel inheritance is implemented in one java file by creating multiple classes
	class GrandParentClass
	{
		public void methodGrandparent() 
		{
			System.out.println("GrandParent Method");
		}
	}
	
	class ClassParent extends GrandParentClass
	{
		public void methodParent() 
		{
			System.out.println("Parent Method");
		}
	}
	
	class ClassChild extends ClassParent 
	{
		public void methodChild() 
		{
			System.out.println("Child Parent ");
		}
	}
	

public class DemoMultilevelInheritance //only one public class for compilation unit
{
	

	public static void main(String[] args)
	{
		ClassChild cc = new ClassChild();
		cc.methodParent();
		cc.methodGrandparent();
		cc.methodChild();

	}

}
