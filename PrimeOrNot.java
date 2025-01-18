package test3;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check it is prime or not");
		int num = s.nextInt();
		boolean prime = true;
		for(int i =2; i<=num/2; i++) {
			if(num% i ==0) {
				prime = false;
			}else {
				prime = true;
			}
		}
		if(prime) {
			System.out.println("the given number is prime");
		}else {
			System.out.println("the given number is not a prime ");
		}
         s.close();
	}

}
