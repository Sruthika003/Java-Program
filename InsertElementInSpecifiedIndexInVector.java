package day11Exercise;

import java.util.Vector;

public class InsertElementInSpecifiedIndexInVector {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		   for(int i =0; i<=8; i++) {
			   vec.add(i);
		   }
		   System.out.println("before insert the  vector is "+ vec);
		   vec.add(4, 1000);
		   vec.add(0, 100);
		   System.out.println("after inserting the vector is " + vec);
		   
		   // add elements of a vector to other vector collection
		   Vector<Integer> vec1 = new Vector<>();
		   vec1.addAll(vec);
		   System.out.println(vec1);
		   
		   // to compare two vector collections
		   System.out.println(vec.containsAll(vec1));
	}

}
