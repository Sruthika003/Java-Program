package day9Exercise;

public class SquareFillPattern {

	public static void main(String[] args) {
		// * pattern
		for(int i=1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// numbers pattern
		for(int i =1;i<=5;i++) {
			for(int j=1; j<=5;j++) {
				System.out.print(j+" ");
			}
		System.out.println();
		}

	}

}
