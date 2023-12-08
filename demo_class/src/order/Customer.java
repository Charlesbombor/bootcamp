package demo_class.src.order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wraper Classes, Primitives)

  // Custom Class
  private Order[] orders;
  private int age;

  // Constructor
  public Customer() {
    this.orders = new Order[0];
  }

  public Customer(Order order) {
    this.orders = new Order[] {order};
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  
  public int getAge(){
    return this.age;
  }
  // Getter
  public Order[] getOrders() {
    return this.orders;
  }

  


  public Order getOrder(int orderId){
    for(int i = 0; i<orders.length; i++){
      if( orderId == orders[i].getId()){
        return this.orders[i];
      }
      
    }

    return null;
  }

  

  public boolean updateOrderAmount(int orderId, double totalAmount) {
    for (int i = 0; i < this.orders.length; i++) {
      if (orders[i].getId() == orderId) {
        orders[i].setTotalAmount(totalAmount);
        return true;
      }
    }
    return false;
  }

  public boolean deleteOrder(int orderId) {
    Order[] newArr = new Order[this.orders.length - 1]; // Local variable
    boolean found = false;
    int idx = 0;
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId != this.orders[i].getId()) {
        if (idx == this.orders.length - 1)
          break;
        newArr[idx++] = this.orders[i]; // 10 -> 9
      } else {
        found = true;
      }
    }
    if (found)
      this.orders = newArr;
    return found;
  }

  // Setter
  public void addOrder(Order order) {
    // It is a new array object
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  public boolean isVIP(){
    return this.orders.length>100;
  }

  public char membership() {  // 'G,', 'S', 'N'
    if (this.orders.length > 100){
      return 'G';
    } 
    if (this.orders.length > 80){
      return 'S';
    }
    if (this.orders.length == 0){
    }
    return 'N';
  }

  

  @Override
  public String toString() {
    return "Customer(orders=" + Arrays.toString(this.orders) + ")";
  }

  public static void main(String[] args) {
    // // New a customer object
    // Order o1 = new Order(1, LocalDate.of(2023, 10, 26), 2500.0d);
    // Order o2 = new Order(2, LocalDate.of(2023, 10, 28), 3000.0d);
    Item[] items = new Item[]{new Item(10.0, 4, "ABC")
                                      , new Item(5.0, 2, "DEF")};
    Customer customer = new Customer(
        new Order[] {new Order(1, LocalDate.of(2023, 10, 26), items), 
            new Order(2, LocalDate.of(2023, 10, 28), items)});

    System.out.println("before: " + customer.toString());
    // o2.setTotalAmount(4000.0d);
    System.out.println("after: " + customer.toString());

    customer.addOrder(new Order(3, LocalDate.of(2000, 10, 1), items));

    System.out.println("after adding order: " + customer.toString());

    customer.deleteOrder(2);
    System.out.println("after delete order: " + customer.toString());

    System.out.println("*" + customer.getOrder(1).totalAmount());



    // System.out.println("Order 1=" + o1);
    // Order 1=Order(id=1, buyDate=2023-10-26, totalAmount=2500.0)

    // New some order objects, and put into the customer object

    // research -> Class of class
   

  }

}

