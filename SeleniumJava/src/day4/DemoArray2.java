package day4;

public class DemoArray2 {

	public static void main(String[] args) 
	{
		int a[]= {12,65,45,78,};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		char ch[]={'J','A','V','A'};
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
		int arr[]= {12,65,45,78,};
		for(int i : arr)
		{
			System.out.println("\n"    + i);
		}
		
	}

}
//for each loop also called as advanced or enhanced for loop
//it is mainly used in traverse array or collection of elements.
//it makes the code more readable
//it eliminates the possibility of programming error
//you need not to specify the initialization,condition and increment or decrement as you specify in the normal for loop.