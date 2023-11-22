public class DemoDouble {
  
  public static void main (String[] args){

    double d1 = 0.1; // If no notation, default it is double value
    double d10 = 0.8d; // d is the notation of double
    double d2 = 0.2; 
    double d3 = d1 + d2;
    System.out.println(d3); // 0.30000000000000004 there is a problem with double

    double d4 = 19999.31123912302110109;
    System.out.println(d4); // 1999.31123912302

    float f1 = 0.2f; // f is the notation of float
    float f2 = 1999.83749832749237492374f;
    System.out.println(f2); // 1999.8375
    // Double can store more digits than Float
  }
}
