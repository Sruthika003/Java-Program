package day5Exercise;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number you want a table from 1 to 10");
		int num = sc.nextInt();
		int i =1;
		while(i<=10) {
			int a = num *i;
			System.out.println(num + " "+"*"+" "+i+" "+"="+" "+a);
			i++;
		}
		

	}

}
