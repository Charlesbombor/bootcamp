package Demo;

import java.math.BigDecimal;

// BigDecimal has NO the "final" keyword, so SuperDecimal can inherit it
public class SuperDecimal extends BigDecimal {

  public SuperDecimal(){   // new BigDecimal ("0.0")
    super("0.0");
  }

  public SuperDecimal (double value){
    super(String.valueOf(value)); // new BigDecimal(3.0)
  }

  // tools
  public static SuperDecimal valueOf(double value){
    return new SuperDecimal(value);
  }


 
  public SuperDecimal multiply(SuperDecimal value){
    BigDecimal bd = this;  // upcast
    BigDecimal bdValue = value; // upcast
    return new SuperDecimal(bd.multiply(bdValue).doubleValue());
  }

  public static void main(String[] args) {
    
  
   SuperDecimal sd =  new SuperDecimal(); // calling BigDecimal()
   // 3.0 x 4.0
   SuperDecimal sd2 = new SuperDecimal(3.0);
   SuperDecimal sd3 = SuperDecimal.valueOf(4.0);
    SuperDecimal sd4 = sd2.multiply(sd3);
    System.out.println(sd4.doubleValue());
    BigDecimal x = new BigDecimal (3.0);
    BigDecimal y = new BigDecimal (4.0);
    
    System.out.println(x.multiply(y));  

    // sd2, sd3 inherit all BigDecimal public instance methods
    
}
}
