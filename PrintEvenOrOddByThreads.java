package day11Exercise;
 class Print extends Thread{
	 public void run() {
		 for(int i =1; i<=20; i++) {
			 if(i%2 ==0) {
				 System.out.println(i+ " even number");
			 }else {
				 System.out.println(i +" odd number");
			 }
		 }
		 
	 }
 }
public class PrintEvenOrOddByThreads {

	public static void main(String[] args) {
	    Print p = new Print();
	    p.start();

	}

}
