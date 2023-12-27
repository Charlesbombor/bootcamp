package Practicing.src;

import java.util.Arrays;

public class charlesPractic2965 {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    int k = 0;
    int t = 0;
    int counter = 0;
    int max = 0;
    int ttelements = 0;
    int[] result = new int[2];
   // int[][] grid = new int[][] {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}; // [[9,1,7],[8,9,2],[3,4,6]]
    // System.out.println(grid.length);
    // System.out.println(grid[j].length);
    ttelements = grid.length * grid[k].length;

    for (t = 1; t <= ttelements; t++) {
        counter = 0;
      for (i = 0; i < grid.length; i++) {
        for (j = 0; j < grid[k].length; j++) {
          if (t == grid[i][j])
            counter++;

          if (counter > max) {
            max = counter;
            result[0] = t;
          }
        }
      }
      if (counter == 0)
      result[1] = t;
    }

  


    System.out.println(Arrays.toString(result));

  }
}
