package demo_thread.src;

public class CustomThread extends Thread {
  @Override
  public void run() {
    System.out.println("CustomThread is running...");
  }
}
