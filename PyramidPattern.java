package day9Exercise;

public class PyramidPattern {

	public static void main(String[] args) {
		// right half pyramid
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println();
        // reverse right half pyramid
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	System.out.println();
	System.out.println();
		// left half pyramid
	for(int i=5; i>=1; i--) {
			for(int j=1;j<i; j++) {
			System.out.print(" ");
		}
			for(int k=5; k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println();
		System.out.println();
		//reverse left pyramid
  for(int i=5; i>=1;i--) {
		for(int j=1;j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		for(int k=5; k>=i;k--) {
			System.out.print(" ");
		}
  }	
  System.out.println();
  System.out.println();
	// full pyramid
  int n=5;
          for(int i=1; i<=n;i++) {
        	  for(int j=1; j<=n-i; j++) {
        		  System.out.print(" ");
        	  }
        	  for(int k=1;k<=2*i-1;k++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();

         }
          
         for(int i= n-1; i>=1;i--) {
        	 for(int j=1; j<=n-i; j++) {
        		 System.out.print(" ");
        	 }
        	 for(int k=1; k<=2*i-1; k++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
       }
  
		
	}

}
