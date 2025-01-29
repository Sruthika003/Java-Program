package day12Exercise;
class Array extends Thread{
	int a[] = {1, 2, 4,6,4,2};

	public void run() {
		for(int i =0; i< a.length; i++) {
			for(int j= i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
				
			}
		}
	}
}
public class PrintRepeatedElementInArrayUsingThread {

	public static void main(String[] args) {
		
	Array arr = new Array();
	arr.start();

	}

}
