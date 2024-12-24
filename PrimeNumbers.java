package day5Exercise;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find prime or not");
		int num = sc.nextInt();
		if(num<2) {
			System.out.println("it is not prime number");
		}
		boolean isPrime = true;
		int divisor = 2;
		while(divisor <= num/2) {
			if(num % divisor ==0) {
				isPrime = false;
				break;
			}
			divisor++;
		}

		if(isPrime) {
			System.out.println("The given number is prime");
		}else {
			System.out.println("The given number is not prime number");
		}
	}

}
