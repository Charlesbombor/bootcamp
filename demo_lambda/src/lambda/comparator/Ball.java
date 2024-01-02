package demo_lambda.src.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball implements Comparable {

  private Color color;

  private double price;

  public Ball(Color color, double price) {
    this.color = color;
    this.price = price;
  }

  public Color getColor() {
    return this.color;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString(){
    return String.valueOf(this.color);
    return .toString(this.price);
  }

  // @Override
  // public double compareTo(Ball b) {
  //   return 0.0;
  // }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>(List.of(new Ball(Color.WHITE, 2.1), 
                                                new Ball(Color.RED, 2.1),
                                                new Ball(Color.YELLOW, 3.4))); 

    // Approach 1                                          
    //  Collections.sort(balls, new SortByColor());  
    //   System.out.println(balls);
      
    //   Collections.sort(balls, new SortByPrice());
    //   System.out.println(balls);

      // Approach 2
      // Lambda Expression: 1) implementing the logic of the requied mehtod, 
      // 2) new the object with that implementation
      Comparator<Ball> sortByColor = (b1, b2) -> {
        return b2.getColor().name().compareTo(b1.getColor().name());
      };

      Comparator<Ball> sortByPrice = (b1, b2) -> {
        return b2.getPrice() > b1.getPrice() ? 1 : -1;
      };

      Comparator<Ball> sortByColorAndThenPrice =
      sortByColor.thenComparing(sortByPrice);

      Collections.sort(balls, sortByColorAndThenPrice); 
      //<Ball> void java.util.Collections.sort(List<Ball> list, Comparator<? super Ball> c)
      System.out.println(balls);

      // Sort by Price
      Collections.sort(balls,(b1, b2)  -> b2.getPrice() > b1.getPrice() ? 1 : -1);


}
}
