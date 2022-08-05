package day4;

public class DemoString {

	public static void main(String[] args) {
		// String is a sequence of character ,but in java it is object..
		// String can be declared in two ways
		
		//[1]  By string literal ----> String str == "Hello";
		//[2]  BY new Keyword -------> String st = new String("Hello");
		
		String Str = "Java";
		String S = "Hello in the world of java";
		
		
		System.out.println("Uppercase--->" + Str.toUpperCase());
		System.out.println("Lowercase---->" + Str.toLowerCase());
		System.out.println("LENGTH------->" + Str.length());
		
		System.out.println("Concate----->" + Str.concat("HEllo"));
		System.out.println("Equal------->" + Str.equals("java"));
		System.out.println("EqualIgnoreCase------->"  +  Str.equalsIgnoreCase("java"));
		System.out.println("Replace---------->" + Str.replace('J','M'));
		System.out.println("Contains------>" + Str.contains(Str));
		
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Reverse---->" + sb.reverse());
		
		
	
		
		
	}

}
