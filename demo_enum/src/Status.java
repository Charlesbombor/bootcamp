public enum Status {

  // How enum being intialized:
// Step 1: normal class
// Step 2: Someone "new" this class object and place it into memory
  ORDERD('O'), // 
  SHIPPED('S'), // 
  COMPLETED('C'), //
  ;

  private char val;

  private Status (char val){  // Status('O')  --> Status.ORDERED('O')
    this.val = val;
  }

  public char getVal(char c){
    return val;
  }

  public static void main(String[] args) {
    System.out.println();
  }

  

}
