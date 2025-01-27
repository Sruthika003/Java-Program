package day11Exercise;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseOrderInTreeSet implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new ReverseOrderInTreeSet());
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(100);
        set.add(8);
        set.add(10);
System.out.println("befor the set "+ set);
        System.out.println("The set in reverse order: " + set);
    }
}

