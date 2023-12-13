import java.math.BigDecimal;

public class charles1716 {
  public static void main(String[] args) { 
  
  int  n = 26; // days of saving
  int week = 0;
  int extraday = 0;
  int extraweek = 0;
  int ndaysaving = 0;
  int extradaytotal = 0;
  week = n / 7;
  System.out.println(week);
  extraday = n % 7;
  System.out.println(extraday);

for (int i = 1; i<=week; i++){
  extraweek += i-1;
}

  
if (week > 0){
  for (int i = 1; i<=extraday; i++){
    extradaytotal += i+(week);
  }
}
  System.out.println("extradaytotal " + extradaytotal);
  System.out.println((7*(extraweek)));
if (week == 0){
  for (int i=0; i <= n; i++){
    ndaysaving += i;
}
} else {
  ndaysaving = (28*week) + (7*(extraweek)) + extradaytotal;
}
  System.out.println((28*week) + (7*(extraweek)));
  System.out.println(ndaysaving);




}
}
