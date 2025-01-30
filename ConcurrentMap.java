package day13Exercise;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
class SharedMap {
		 private final Map<Integer, String> map;
		    public SharedMap() {
		        this.map = Collections.synchronizedMap(new HashMap<>());
		    }
		    public void putValue(Integer key, String value) {
		        synchronized (map) { 
		            map.put(key, value);
		            System.out.println(Thread.currentThread().getName() + " added: " + key + " -> " + value);
		        }
		    }
		    public void printMap() {
		        synchronized (map) { 
		            System.out.println("Final Map: " + map);
		    }}}
		class MapUpdaterThread extends Thread {
		    private final SharedMap sharedMap;
		    private final int startKey;
		    public MapUpdaterThread(SharedMap sharedMap, int startKey) {
		        this.sharedMap = sharedMap;
		        this.startKey = startKey;
		    }
		    @Override
		    public void run() {
		        for (int i = 0; i < 5; i++) {
		            sharedMap.putValue(startKey + i, "Value-" + (startKey + i));
		            try {
		                Thread.sleep(50); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        } }}

		public class ConcurrentMap {
		    public static void main(String[] args) {
		        SharedMap sharedMap = new SharedMap();
		        Thread t1 = new MapUpdaterThread(sharedMap, 1);
		        Thread t2 = new MapUpdaterThread(sharedMap, 10);
		        Thread t3 = new MapUpdaterThread(sharedMap, 20);
		        t1.start();
		        t2.start();
		        t3.start();
		        try{
		            t1.join();
		            t2.join();
		            t3.join();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        sharedMap.printMap();
		    }}
