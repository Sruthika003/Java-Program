package day5Exercise;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter veg or non-veg for menu");
		String a = sc.next();
		switch(a) {
		case "veg":
			System.out.println("1.sambar rice");
			System.out.println("2.curd rice");
			System.out.println("3.tomato rice");
			System.out.println("4.veg briyani");
			System.out.println("5.mushroom rice");
			break;
		case "non-veg":
			System.out.println("1.egg briyani");
			System.out.println("2.chicken briyani");
			System.out.println("3.mutton briyani");
			System.out.println("4.prawn briyani");
			System.out.println("5.beef briyani");
			break;
		default:
			System.out.println("you are enter the write card");
		}

	}

}
