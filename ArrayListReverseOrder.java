package test4;

import java.util.ArrayList;

public class ArrayListReverseOrder {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		System.out.println("the reverse order is:");
		for(int i = arr.size()-1; i>=0; i--) {
			System.out.print(arr.get(i)+ " ");
		}
		

	}

}
