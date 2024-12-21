package day4Excercise;

import java.util.Scanner;

public class ControlExercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the hero name(vijay/ajith/rajini)");
		String name = sc.next();
		if(name.equalsIgnoreCase("vijay")) {
			System.out.println("1.Jilla");
			System.out.println("2.Mersal");
			System.out.println("3.Thaliva");
		}else if(name.equalsIgnoreCase("ajith")){
			System.out.println("1.Thunivu");
			System.out.println("2.Valimai");
			System.out.println("3.Viswasam");
		}else if(name.equalsIgnoreCase("rajini")) {
			System.out.println("1.Jailer");
			System.out.println("2.Muthu");
			System.out.println("3.Thalapathy");
		}else {
			System.out.println("your given name are not in the list");
		}

	}

}
