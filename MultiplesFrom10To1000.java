package test4;

import java.util.ArrayList;

public class MultiplesFrom10To1000 {

	public static void main(String[] args) {
		ArrayList<Integer> multipleNum = new ArrayList<>();
		for(int i=10; i<=1000; i++) {
			if(i%10 ==0) {
				multipleNum.add(i);
				
			}
		}
       for(int number:multipleNum) {
    	   System.out.print(number+" ");
       }
	}

}
