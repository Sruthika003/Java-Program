package day10Exercise;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
	String s = "java";
	
	// String length method
	System.out.println(s.length());
	
	//String charAt method to get the particular character by using the index
	System.out.println(s.charAt(2));
	
	// String concat method is used to append particular string at the end of the given string
	System.out.println(s.concat("course"));
	
	//same as concat method but using the + operator
	System.out.println(s+"full stack");
	
	//String equals method 
	System.out.println(s.equals("java"));
	
	//String equalIngnoreCase method
	System.out.println(s.equalsIgnoreCase("JAVA"));

	//isEmpty method to check the given string is empty or not
	System.out.println(s.isEmpty());
	
	//String replace method to replace the particular character or word in the String
	System.out.println(s.replace('a', 'A'));
	
	//String subString Method is used to get the particular length string from the given string
	System.out.println(s.substring(2));
	System.out.println(s.substring(1, 3));
	
	// String indexOf method is used to get the particular character index by using the character
	System.out.println(s.indexOf('a'));
	System.out.println(s.lastIndexOf('a'));
	
	// String toLowerCase method is used to convert the given string into lower case
	System.out.println(s.toLowerCase());
	
	// String toUpperCase method is used to convert the given string into upper case
		System.out.println(s.toUpperCase());
		
	String s1 = "  java full stack course   ";
	System.out.println("Befor trim: "+s1.length());
	System.out.println("After trim: "+s1.trim().length());
	
	//toString method
	System.out.println(s1.toString());
	
	//startWith 
	System.out.println(s.startsWith("java"));
	
	//endWidth 
	System.out.println(s.endsWith("e"));
	
	//split method 
	String[] arr = s1.split(" ");
	System.out.println(Arrays.toString(arr));
	
	//valueOf method it returns the string
	int a = 199;
	String s2 = String.valueOf(a);
	System.out.println(s2+ 1);
	
	
	}

}
