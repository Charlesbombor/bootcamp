package demo_thread.src;

public class SharedResrouce {
  private boolean hasData = false; // Shared Resource

  // 1. both 2 thread starts at the same time
  // 2. Producer thread -> "synchronized produce" -> acquire the lock
  // 3. Cosumer thread is waithing outside the door of "synchronized consume"
  // 4.Producer thread -> producing the data -> notify (wake up other threads)
  // 5.Producer thread -> wait() -> release the lock
  // 6.Consumer thread -> get the lock -> get into "synchronized consume()"

  // 1. waiting thread has to be notified by someone
  // 2. synchronized instance method can only be accessed when the tread has the key (lock)

  public synchronized void produce() throws InterruptedException {
while (hasData) {
  System.out.println("producer - > self wait...");
  wait(); // wait() control current Thread to sleep
}
System.out.println("Thread id" + Thread.currentThread().getId() + "Producing data...");
Thread.sleep(2000); // simulate produce process...
hasData = true;
notify(); // notify consumer thread to prceed
  }

  public synchronized void consume() throws InterruptedException {
    while(!hasData) {
      System.out.println("consumer -> self wait...");
      wait(); // Object.wait() notify()
      
    }
    System.out.println("Thread ID:" + Thread.currentThread().getId() + "Consuming data...");
    Thread.sleep(2000);  // simulate produce process...
    hasData = false;
    System.out.println("Consumed Data.");
    notify();
  }

  public static void main(String[] args) {
    SharedResrouce sharedResrouce = new SharedResrouce();
    
    Runnable produceData = () -> {
      try {
        sharedResrouce.produce();
      }catch (InterruptedException e){

      }
    };

    Runnable consumeData = () -> {
      try {
        sharedResrouce.consume();
      }catch (InterruptedException e){

      }
    };

    Thread producer = new Thread(produceData);
    Thread consumer = new Thread(consumeData);

    producer.start();
    consumer.start();
    System.out.println("main end...");

  }
}
