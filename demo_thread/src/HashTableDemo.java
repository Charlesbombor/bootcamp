package demo_thread.src;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class HashTableDemo {
  // HashTable (thread safe) vs HashMap (non-thread safe)
  // put()

public static void main(String[] args) throws InterruptedException{
  
    Hashtable<String,String> hashTable = new Hashtable<>();
    hashTable.put("b", "banana");
    hashTable.put("b", "bowling");
    //System.out.println(hashTable);
    Map<String, String> hashMap = new HashMap<>();

    Runnable hashTableAdd = () -> {
      for(int i=0; i < 100_000; i++){
        hashTable.merge("x", "s", (oldVal, newVal) -> oldVal.concat(newVal));
      }
        };
    
      Runnable hashMapAdd = () -> {
      for(int i=0; i < 100_000; i++){
         hashMap.merge("x", "s", (oldVal, newVal) -> oldVal.concat(newVal));
      }
    };

    Thread worker1 = new Thread(hashTableAdd);
    Thread worker2 = new Thread(hashTableAdd);
    worker1.start();
    worker2.start();
    worker1.join();
    worker2.join();
    System.out.println(hashTable.get("x").length());

    worker1 = new Thread(hashMapAdd);
    worker2 = new Thread(hashMapAdd);
    worker1.start();
    worker2.start();
    worker1.join();
    worker2.join();
    System.out.println(hashMap.get("x").length()); 

}
}

