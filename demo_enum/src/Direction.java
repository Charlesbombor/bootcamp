public enum Direction {
  NORTH(1), //
  EAST(2), // 
  WEST(-2), //
  SOUTH(-1),//
  ;

  private int value;
  private Direction (int value){
    this.value = value;
  }

  private int getValue(){
    return this.value;
  }



// static method
  public static Direction opposite(Direction direction){
   return Direction.fromValue(direction.getValue()* -1);
  }

  private static Direction fromValue(int value){
    for (Direction d : values()){
      if (d.getValue() == value){
        return d;
      }
    }
    return null;
  }


// instance method
  public Direction opposite() {
    return Direction.fromValue(this.value * -1);
  } 

  public boolean isOpposite(Direction direction) {
    return this == Direction.fromValue(direction.getValue() * -1);
  } 

  public static void main(String[] args) {
    System.out.println(Direction.WEST.opposite());
    System.out.println(Direction.opposite(Direction.EAST));
    String result = Direction.WEST.opposite().name(); // result = "EAST"
    String result2 = Direction.WEST.opposite().toString(); // result = "EAST"
  }
}
