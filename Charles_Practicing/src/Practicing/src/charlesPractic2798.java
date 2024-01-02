package Charles_Practicing.src.Practicing.src;
public class charles2798 {
  public static void main(String[] args) {
    
    int target = 2;
    int okpeep = 0;
    int[] hours = new int[]{0,1,2,3,4};
    
    for (int i=0; i < hours.length; i++){
      if (hours[i] >= target){
        okpeep++;
      }
    }
    System.out.println(okpeep);
  }
  }

