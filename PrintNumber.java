package day5Exercise;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check it is divisible by 2 and 4");
		int num = sc.nextInt();
		while(num>0) {
			if(num%2 == 0 && num %4 == 0) {
			System.out.println(num +" is divisible by 2 and 4");
		
			}else {
		        System.out.println("it is not divisible by both numbers");
			}	
		
			break;
        
	}

	}
}
