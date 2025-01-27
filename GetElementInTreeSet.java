package day11Exercise;

import java.util.TreeSet;

public class GetElementInTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(100);
		set.add(8);
		set.add(10);
		
		System.out.println(set);
		System.out.println("first element in the set "+set.first());
		System.out.println("last element in the set "+set.last());
	
	}

}
