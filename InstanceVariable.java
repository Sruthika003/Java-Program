package day2Excercise;

public class InstanceVariable {
         int a = 10;
         int b = 40;
       public void sum() {
    	   int c = a+b;
    	   System.out.println(c);
       }
	public static void main(String[] args) {
	InstanceVariable var = new InstanceVariable();
	var.sum();
	}

}
