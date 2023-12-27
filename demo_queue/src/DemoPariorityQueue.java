package demo_queue.src;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPariorityQueue {
  
  public static void main(String[] args) {
    Queue<String> qs = new PriorityQueue<>();
    
    qs.add("hello");
    qs.add("a");
    qs.add("x");

    System.out.println(qs);

    Queue<String> qs2 = new PriorityQueue<>(new SortByDesc());
    qs2.add("hello");
    qs2.add("a");
    qs2.add("x");

    System.out.println(qs2.poll());


  }
}
