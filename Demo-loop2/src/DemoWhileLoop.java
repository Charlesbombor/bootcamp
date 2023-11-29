public class DemoWhileLoop {
  public static void main(String[] args) {

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum = sum + i;
    }
    System.out.println("sum= " + sum);

    int j = 0;
    sum = 0;
    while (j < 5) {
      sum += j++;
      // sum =sum+ j++;
    }
    System.out.println("sum= " + sum + ", j=" + j);

    // continue, break
    // 1,3,5,7,9
    j = 0;

    while (++j <= 10) {
      if (j > 5)
        break;
      if (j % 2 == 0)
        continue;

      System.out.println(j);

    }
    int x=10;
    int y=5;
    while (x>0 && y>0){
      System.out.println("x=" + x + ", y=" + y);
      x--;
      y--;
    }

    x=10;
    y=5;
    for (x=0, y=0; x>0 && y>0; x-- , y--){
      System.out.println("*x=" + x + ", y=" + y);

    }
    // 1 1 2 3 5 8 13....<1000
    int x1=0;
    int x2=1;
    int ans=1;
    while (ans <1000){
       x2=x1;
       x1=ans;
       ans=x1+x2;
      System.out.println(ans); 
      System.out.println("x1 " + x1);
    }
    System.out.println("*sum= " + x1);
  }
}
