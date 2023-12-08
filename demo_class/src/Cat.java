package demo_class.src;

public class Cat {
  private String name;
  private int age;
  private int integer;

  // If there is no constructor explicitly in a class
  // empty constructor is provided by default
  // while created a constructor, default empty constructor by java will be cancelled

  public Cat(){

  }

  public Cat(String name, int age){
    this.name = name;
    this.age = age;
    }

    public Cat(int age, String name){
    this.name = name;
    this.age = age;
    }

    public static int sum(Integer... integer){
      int sum = 0;
      for (Integer i : integer) {
        sum += i;
      }
      return sum;
    }

    public static int sum2(int[] arr){
      int sum = 0;
      for (Integer i : arr) {
        sum += i;
      }
      return sum;
    }

    public static void main(String[] args) {
      System.out.println(sum(1,2,3,4,5));
      int []arr = new int[]{1,2,3,4,5};
      System.out.println(sum2(arr));
    }

}
