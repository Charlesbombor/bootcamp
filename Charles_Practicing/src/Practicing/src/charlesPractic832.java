package Charles_Practicing.src.Practicing.src;

import java.util.Arrays;

public class charlesPractic832 {
public static void main(String[] args) {
int[][] image = new int[][]{{1,1,0},{1,0,1},{0,0,0}};

  int i = 0;
  int j = 0;
  int temp = 0;
  int head = 0;
  int tail = 0;
 

  for (i=0; i<image.length; i++){
      for(j=0; j<image[i].length/2; j++){

          int jLeng = image[i].length;
          temp = image[i][j];
          image[i][j] = image[i][jLeng-1-j];
          image[i][jLeng-1-j] = temp;
      }
  }
System.out.println(Arrays.toString(image[0]));
System.out.println(Arrays.toString(image[1]));
System.out.println(Arrays.toString(image[2]));

   for (i=0; i<image.length; i++){
      for(j=0; j<image[i].length; j++){
          if (image[i][j] == 0)
          image[i][j] = 1;
          else
          image[i][j] = 0;
      }
   }

   System.out.println(Arrays.toString(image[0]));

}
}
