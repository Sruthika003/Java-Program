package test;

public class SearchArray {

	public static void main(String[] args) {
		int flag =0, pos = 0;
		int arr[] = {10,20,30,40,50};
		int searchNum = 50;
		int len = arr.length;
		for(int i =0; i<len;i++) {
			if(arr[i] == searchNum) {
				flag =1;
				pos = i +1;
			} else {
				flag =0;
			}
		}
		
if(flag ==1) {
	System.out.println("The number " +searchNum +" is found in the position "+ pos);
}else {
	System.out.println("The given number is not found in the array");
}
	}

}
