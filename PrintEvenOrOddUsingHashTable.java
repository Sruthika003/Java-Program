package test4;

import java.util.Hashtable;

public class PrintEvenOrOddUsingHashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> numValue = new Hashtable<>();
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				numValue.put(i, "even");
			}else {
				numValue.put(i, "odd");
			}
		}
		numValue.forEach((number, type)->System.out.println("Number "+ number+" is "+type ));;
	}

}
