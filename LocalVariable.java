package day2Excercise;

public class LocalVariable {
	
	public int multiple() {
	int a = 10;
	int b = 40;
	return a * b;
	}
	

	public static void main(String[] args) {
		LocalVariable var = new LocalVariable();
	System.out.println(var.multiple());

	}

}
