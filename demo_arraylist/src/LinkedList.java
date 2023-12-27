public class LinkedList {

  private Node head;

  public LinkedList(){

  }

  public void add(int value){
    if (this.head == null){
    this.head = new Node(value);
    return;
    }
    // while loop until tail, then setNext()
    Node current = this.head;
    while (current.next() != null){
      current = current.next();
    }
    current.setNext(new Node(value));
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder("LinkedList[");
    Node curNode = this.head;
    while (curNode != null){
      sb.append (curNode.getValue());
      curNode = curNode.next();
      sb.append(", ");
    }
    return sb.append("]").toString();
   
  }

  // remove(int value)
  public void remove(int value){
    // Early Return
    if (this.head == null)
    return;
    if (this.head.getValue() == value){
      this.head = this.head.next();
    }
    Node curNode = this.head;
    while (curNode != null){
      if (curNode.getValue() == value){
        if (curNode.next() == null){
          curNode.prev().setNext(null);
        }else{
        curNode.prev().setNext(curNode.next());
      }
      curNode = curNode.next();
    }
  }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(3);
    ll.add(100);
    System.out.println(ll.toString());
    ll.remove(100);
    System.out.println(ll.toString());
  }
}
