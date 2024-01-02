package demo_lambda.src.lambda.comparator;

public class SortByPrice implements comparator<Ball> {
  
  @Override
  public int compare(Ball b1, Ball b2){
    return b1.getPrice() > b2.getPrice() ? -1 : 1;
  }
}
