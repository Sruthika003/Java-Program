package test3;

public class SwappingValuesWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 26;
		System.out.println("Before swapping the value of a is "+ a);
		System.out.println("Before swapping the value of b is "+ b);
		System.out.println();
		 a = a +b;
		 b = a-b;
	     a = a-b;
	     System.out.println("After swapping the value of a is "+a);
	     System.out.println("After swapping the value of b is "+b);
	}

}
