package day11Exercise;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
         Vector<Integer> v = new Vector<>();
         for(int i = 0; i<=6; i++) {
        	 v.insertElementAt(i,i);
             
         } 
         Vector<Integer> v1 = new Vector<>();
         
         for(int i = 0; i<=6; i++) {
        	 v1.insertElementAt(i,i);
             
         } 

        System.out.println("v "+ v);
        System.out.println("v2 "+ v1);
       
       //  access first element 
       System.out.println(v.firstElement());
       
       //access last element
       System.out.println(v.lastElement());
       
       // remove 
       v.remove(0);
       System.out.println(v);
       
       // removeall
       v1.removeAll(v);
       System.out.println("after removing all element in v1 "+ v1);
       
       // remove element
       System.out.println(v.removeElement(v));
 
       



	}

}
