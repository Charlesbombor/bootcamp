import java.util.Arrays;

public class Practing_array {
  public static void main(String[] args) {
    boolean gened = false;
    int i;
    int j;
    char[] arr = new char[5];
    String str;
    int [] sort = new int[]{1,2,3,4,2};
    // for (j=0; j<sort.length-1; j++){ // check unique
    //   if (sort[j] == (sort[j+1])){
    //     gened = false;
    //     System.out.println(gened);
    //     break;
    //    }
    //    else {
    //     gened = true;
    //    }
    //   }
    //   System.out.println(gened);

      
      str = Arrays.toString(sort);
      
      System.out.println(str.indexOf(0));

      arr = str.toCharArray();

      System.out.println(arr);

      
  
    

    }

  }

