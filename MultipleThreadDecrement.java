package day13Exercise;
class SharedCounter {
		 private int counter;

		    public SharedCounter(int initialCount) {
		        this.counter = initialCount;
		    }
		    public synchronized void decrement() {
		        if (counter > 0) {
		            counter--;
		            System.out.println(Thread.currentThread().getName() + " decremented counter to: " + counter);
		        }  }
		    public int getCounter() {
		        return counter;
		    }}
		class DecrementThread extends Thread {
		    private final SharedCounter sharedCounter;

		    public DecrementThread(SharedCounter sharedCounter) {
		        this.sharedCounter = sharedCounter;
		    }
		    @Override
		    public void run() {
		        for (int i = 0; i < 5; i++) {
		            sharedCounter.decrement();
		            try {
		                Thread.sleep(50); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }}}}

		public class MultipleThreadDecrement {
		    public static void main(String[] args) {
		        SharedCounter sharedCounter = new SharedCounter(20); 

		        Thread t1 = new DecrementThread(sharedCounter);
		        Thread t2 = new DecrementThread(sharedCounter);
		        Thread t3 = new DecrementThread(sharedCounter);

		        t1.start();
		        t2.start();
		        t3.start();

		        try {
		            t1.join();
		            t2.join();
		            t3.join();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        System.out.println("Final counter value: " + sharedCounter.getCounter());

	}

}
