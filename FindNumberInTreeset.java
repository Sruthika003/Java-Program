package day11Exercise;

import java.util.TreeSet;

public class FindNumberInTreeset {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(8);
		set.add(10);
		set.add(100);
		System.out.println("Number less than 7:");
		for(int i : set) {
			if(i<7) {
				System.out.print(i+ " ");
			}
		}

	}

}
