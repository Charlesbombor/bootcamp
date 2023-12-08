package demo_class.src.order;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {
  private int id;
  private LocalDate buyDate;
 private double totalAmount;
  private Item[] items;
  private int age;

  private static int orderNo;

  public Order(){

  }

  public int getId (){
    return this.id;
  }

  //public Order(int id, LocalDate buyDate, double totalAmount){
    public Order(LocalDate buyDate, Item[] items){
    this.id = ++orderNo;
    this.buyDate = buyDate;
    this.items = items;
    //this.totalAmount = totalAmount;
  }

 
  
  public double totalAmount(){
    BigDecimal total = BigDecimal.valueOf(0);
    BigDecimal price = BigDecimal.valueOf(0);
    BigDecimal quantity = BigDecimal.valueOf(0);
    for (int i = 0; i < items.length; i++){
      
      total = total.add(BigDecimal.valueOf(this.items[i].totalAmount()));
    }
    return total.doubleValue();
  }



 

 @Override
  public String toString(){
     return "id is " + this.id + "\n" + "BuyDate is " + this.buyDate 
            + "\n" + "TotalAmount is " + totalAmount();
           
     
  }

  public void addOrder(Order order){
    
  } 

  public void addItem (Item items){
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length-1] = items;
    this.items = newItems;
  }

   
  public static void main(String[] args) {
    Item[] items = new Item[]{new Item(10.0, 4, "ABC")
                                      , new Item(5.0, 2, "DEF")};

    Item[] items2 = new Item[]{new Item(30, 3, "HKJ")};                               
    Order o3 = new Order(3, LocalDate.of(2023, 10, 30), items);
   System.out.println(o3.toString());
   System.out.println(o3.totalAmount());

   o3.addItem(new Item(40.0, 2, "XYZ"));
   System.out.println("*" + o3.toString());
   Customer c1 = new Customer(); 
   Order o4 = new Order(4, LocalDate.of(2023,11,1), items2);
   c1.addOrder(o4);
   System.out.println("*" + c1.getOrder(4).totalAmount());
   c1.setAge(18);

    if (c1.getAge() >= 18){
      System.out.println("c1 is an adult");
    }



}
  }

