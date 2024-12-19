package day3Exercise;

public class Operators {

	public static void main(String[] args) {
	// Arithmetic Operators
		int num1 = 20;
		int num2 = 70;
		System.out.println("Addition: "+(num1+num2));
		System.out.println("Subraction: "+(num1-num2));
		System.out.println("Multiplication: "+(num1*num2));
		System.out.println("Division: "+(num1/num2));
		System.out.println("Modulus: "+(num1%num2));
		
	// Unary Operators
		int a = 5;
		System.out.println("Post Increment:"+ (a++));
		System.out.println("Pre Increment:"+ (++a));
		System.out.println("Post Decrement:"+ (a--));
		System.out.println("Pre Decrement:"+ (--a));
		
	//Assigning Operators
		System.out.println("Addition: "+(num1+=num2));
		System.out.println("Subraction: "+(num1-=num2));
        System.out.println("Multiplication: "+(num1*=num2));
		System.out.println("Division: "+(num1/=num2));
		System.out.println("Modulus: "+(num1%=num2));
		
	//Comparison Operators
		System.out.println("greather number is:"+(num1>=num2));
		System.out.println("smaller number is:"+(num1<=num2));
		
	// Logical Operators
		int x = 20, y = 40, z= 60;
		System.out.println("AND Operator"+((x>y)&&(x>z)));
		System.out.println("OR Operator"+((x>y)||(x>z)));
		System.out.println("NOT Operator"+(!(x>y)));
		
	//Ternary Operator
		int t =70;
		int s = 90;
		int result = (t>s)? t: s;
		System.out.println(result+" is greater");
		
	//bitwise operator
		int e = 8;
		int g = 5;
		System.out.println("bitwise AND;"+ (e&g));
		System.out.println("bitwise OR;"+ (e|g));
		System.out.println("bitwise AND;"+ (e^g));
		System.out.println("bitwise XOR;"+ (~e));
		
	//Instanceof 
		Operators obj = new Operators();
		System.out.println(obj instanceof Operators);
		
	}

}
