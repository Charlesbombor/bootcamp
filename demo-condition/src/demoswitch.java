public class demoswitch {
  public static void main(String[] args) {
    // if, else-if  --> comparison and logical operators (&& ||  >=...etc)

    // switch: single value comparison (==), which means cannot use logical operators
    char vipGrade = 'G'; // G/S/N
    double discount = 0.0d; // Silver(s) --> 10%, Gold(G) --> 20%
    switch (vipGrade) {
      case 'G':
        discount += 0.1d;
        //System.out.println("grade=A");
      case 'S':
        discount += 0.1d;
      case 'N':
       // System.out.println("grade=B");
     // case 'C':
       // System.out.println("grade=C");
     // case 'D':
       // System.out.println("grade=D");
      //case 'E':
        //System.out.println("grade=E");
    }
     System.out.println("discount=" + discount);
     
     // with break
    discount = 0.0d;
    switch (vipGrade) {
      case 'G':
        discount += 0.2d;
        break;
      case 'S':
        discount += 0.1d;
        break;
      case 'N':
      default: // other characters
  
    }
     System.out.println("discount=" + discount);
     

  }
}
