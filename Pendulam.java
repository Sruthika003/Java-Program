package day9Exercise;

public class Pendulam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
