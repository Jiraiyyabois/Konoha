package day4;

import java.util.Scanner;

public class DemoReverseString {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str , rev = "";
	//Str=sc.next();//will read without spaces
	
	str = sc.nextLine();//read with spaces
	
	int size = str.length();
	
	for(int i= size-1 ;i>=0; i--)
	rev= rev + str.charAt(i); //method returns the character at the specified index of string
	sc.close();
	System.out.println(rev);
	
	if(str.equalsIgnoreCase(rev))
	{
		System.out.println("Palindrome");
	}
	
	else 
	{
		System.out.println("NOt Palindrome");
	}

	}

}
//the java string is immutable(it cannot be changed) whenever we change any string a new sample is created
//for mutable string we can use stringbuffer or string builder class

//string object are stored in an special area known as STRING CONSTANCE POOL

