package demo_generics.src;

public class Search<T> {

  private T value;

  private T[] arr;

  public Search(T value){
    this.value = value;
  }

  public Search (T[] value){
    arr = value;
  }

  @Override
  public String toString(){
    return String.valueOf(this.value);
  }

  public static void main(String[] args) {
    Search<String> m1 = new Search<String>("abc@gmail.com");
    Search<Integer> m2 = new Search<Integer>(12345678);

    Search[] arr = new Search[]{m1,m2};
    
  }
  
}
