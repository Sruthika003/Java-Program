package test;

public class AddMultiDiminsionArray {

	public static void main(String[] args) {
		int a[][] ={ {1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int b[][] = {{5,6,7,8},{9,1,2,3},{5,6,7,8},{6,8,9,0}};
		int c[][] = new int [4][4];
		for(int i =0; i<a.length;i++) {
			for(int j =0; j <b.length; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		
		}
	for(int i =0; i<c.length;i++) {
		for(int j =0; j<c.length;j++) {
			System.out.print(c[i][j]+ " ");
		}
		System.out.println();
	}

	}

}
