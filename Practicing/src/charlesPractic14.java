package Practicing.src;

public class charlesPractic14 {
  public static void main(String[] args) {
    String[] strs = new String[]{"flower","flow","flight"};


    int i = 0;
        int j = 0;
        int k = 0;
        int length = strs.length;
        String str = "";
        char c;
        boolean b = false;

       
       
            for (j=0; j<200; j++){
                c = strs[k].charAt(j);
                k++;
            for (i=0; i<length; i++){
                if (c != strs[i].charAt(j))
                System.out.println(strs[i].charAt(j));
                    b = true;
                    str = strs[i].substring(0, j);
                  
            }
            if (b = true)
            break;
        }

        System.out.println(str);

  }
}
