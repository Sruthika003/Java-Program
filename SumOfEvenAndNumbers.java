package day5Exercise;

public class SumOfEvenAndNumbers {

	public static void main(String[] args) {
		int i = 1;
		int even = 0;
		int odd = 0;
		while(i<=20) {
			if(i%2==0) {
				even +=i;	
			}else {
				odd += i;
			}
			i++;
		}
		System.out.println("The Total for even number:"+ even);
		System.out.println("The Total for odd number:"+ odd);

	}

}
