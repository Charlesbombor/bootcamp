package demo_thread.src;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    StringBuffer sbf = new StringBuffer(); // if we are going to use multiple Thread,
                                           // StringBuffer should be used
                                           // because StringBuffer has synchronized

    sbf.append("hello").append("world");
    sbf.delete(0, sbf.length());
    System.out.println(sbf.toString()); // helloworld


    // StringBuilder vs StringBuffer
    // Runnable -> append "x" 1_000_000 times -> StringBuilder
    // Runnable -> append "x" 1_000_000 times -> StringBuffer


    // StringBuilder
    // long start = System.nanoTime();
    // Thread sbx = new Thread(() -> {
    // for (int i = 0; i < 100_000; i++) {
    // sb.append("x");
    // }
    // });
    // sbx.start();
    // long end = System.nanoTime();
    // System.out.println("StringBuilder append x " + (end - start));

    Runnable appendStringBuilder = () -> sb.append("x");
    Runnable appendStringBuffer = () -> sbf.append("x");



    // long start = System.nanoTime();
    // Thread worker1 = new Thread(appendStringBuilder);
    // worker1.start();
    // long end = System.nanoTime();
    // System.out.println("StringBuilder append x " + (end - start));

    // start = System.nanoTime();
    // Thread worker2 = new Thread(appendStringBuffer);
    // worker2.start();
    // end = System.nanoTime();
    // System.out.println("StringBuffer append x " + (end - start));

    // StringBuffer
    // start = System.nanoTime();
    // Thread sbfx = new Thread(() -> {
    // for (int i = 0; i < 100_000; i++) {
    // sbf.append("x");
    // }
    // });
    // sbfx.start();
    // end = System.nanoTime();
    // System.out.println("StringBuffer append x " + (end - start));

    // Test String Builder
    Thread worker1 = new Thread(appendStringBuilder);
    Thread worker2 = new Thread(appendStringBuilder);

    sb.setLength(0); // similar to clear()
    worker1.start();
    worker2.start();
    try{
      worker1.join();
      worker2.join();
    } catch (InterruptedException e){

    }
    System.out.println(sb.length());







  }
}
