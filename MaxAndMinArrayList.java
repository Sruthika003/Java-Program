package test4;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(100);
		arr.add(89);
		arr.add(178);
		arr.add(56);
		arr.add(2);
		arr.add(3);
	System.out.println(arr);
       System.out.println("min number in the arraylist is:"+ Collections.min(arr));
       System.out.println("min number in the arraylist is:"+ Collections.max(arr));

	}

}
