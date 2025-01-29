package day12Exercise;

import java.util.HashSet;
import java.util.Set;

class Unique extends Thread {
    int a[] = {1, 2, 4, 6, 4, 2, 5};

    @Override
    public void run() {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]); 
        }
        
        System.out.println("Unique elements: " + set);
    }
}

public class PrintUniqueElementInArrayUsingThread {
    public static void main(String[] args) {
        Unique unique = new Unique();
        unique.start();
    }
}
