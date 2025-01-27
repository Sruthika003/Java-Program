package day11Exercise;

import java.util.Arrays;

class Sort extends Thread {
    int[] arr = {1, 7, 5, 9, 10};

    @Override
    public void run() {
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

public class SortAnArrayByUsingThreads {
    public static void main(String[] args) {
        Sort sortThread = new Sort();
        sortThread.start();

        
    }


}
