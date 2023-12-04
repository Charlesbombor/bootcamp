package demo_class.src;

public class CakeOrder {

  private String taste;
  private String orderNum;

  public CakeOrder(){
  }
  

  public CakeOrder (String orderNum, String taste){
    this.orderNum = orderNum;
    this.taste = taste;
  }

  public void orderNum(String orderNum){
    this.orderNum =orderNum;
  }

  public  String getOrderNum (){
    return this.orderNum;
  }

  public void taste(String taste){
    this.taste = taste;
  
}




public static void main(String[] args) {
  CakeOrder c1 = new CakeOrder();
  c1.orderNum("TST-231201A08");
  c1.taste("chocolate");
  CakeOrder c2 = new CakeOrder("SWH-231201A78", "banana");

  System.out.println(c1.getOrderNum());
 


}


}