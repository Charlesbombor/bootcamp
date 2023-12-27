package demo_stack.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DemoStack {

  public static void main(String[] args) {
    // LIFO - Stack
    List<String> stack = new Stack<>();
    // 1. is we use List as reference type, the obj ref has no push() and pop() scope

    Stack<String> ss = new Stack<>();
    ss.push("ABC");
    ss.push("IJK");
    // pop -> get the last element
    System.out.println(ss.pop()); // IJK
    System.out.println(ss.pop()); // ABC
    //System.out.println(ss.pop()); // error, we cannot pop an empty stack

    // 2. You can access the middle element 
    ss.push("aaa");
    ss.push("bbb");
    ss.push("ccc");
    System.out.println(ss.get(0)); // aaa
    System.out.println(ss.get(1)); // bbb

    // 3.Slow
    // Stack
    long start = System.nanoTime();
    for (int i = 0; i <1000000; i++){
      ss.push("A");
    }

    long end = System.nanoTime();
    System.out.println("Stack.push() -> " + (end - start));

    // ArrayList
    start = System.nanoTime();
    ArrayList<String> as = new ArrayList<>(2000000);
    for (int i = 0; i < 1000000; i++ ){
      as.add("A");
    }

    end = System.nanoTime();
    System.out.println("ArrayList.add() -> " + (end - start));

    // LinkedList
     start = System.nanoTime();
    LinkedList<String> ls = new LinkedList<>();
    for (int i = 0; i < 1000000; i++ ){
      ls.add("A");
    }

    end = System.nanoTime();
    System.out.println("LinkedList.add() -> " + (end - start));



  }
  
}
