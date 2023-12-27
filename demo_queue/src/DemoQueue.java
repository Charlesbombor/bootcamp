package demo_queue.src;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
   
    List<String> ls = new LinkedList<>();
    // ls.add, remove, get
    ls.add("ABC");
    ls.add("IJK");
    
    String result = ls.get(0); // ABC
    ls.remove(0);

    // List vs Queue
    // 1. We cannot access the middle elements in the queue. Just get the object from the queue head.
    // 2. Queue is FIFO (First in First out)
    Queue<String> qs = new LinkedList<>();
    qs.add("ABC");
    qs.add("IJK");
    
    String result2 = qs.poll(); // ABC
    System.out.println(result2);
    System.out.println(qs.poll()); // IJK

    System.out.println(qs.size()); // 0

    Deque<String> ds = new LinkedList<>();
    ds.add("ABC");
    ds.addLast("IJK");
    ds.addFirst("MNO");
    System.out.println(ds.size()); // 3
    //MNO, ABC, IJK

     ds.pollFirst(); // ABC, IJK
     ds.pollLast(); // ABC

     ds.removeLast();
     //ds.removeLast();  //  java.util.NoSuchElementException
     ds.pollLast(); // null
     ds.offerLast("JJJ");
    for (String dequeStr : ds ){
    System.out.println(dequeStr); 
  }


  
    

}
}