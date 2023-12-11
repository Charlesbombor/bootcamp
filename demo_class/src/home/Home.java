package demo_class.src.home;

import java.util.Arrays;

public class Home {
  // attributes
  private Member [] members;


  // constructors
  public Home ( Member[] members){
    this.members = members;
  }

  public Home (Member member){
    this.members = new Member[]{member};
  }

  // tools
  @Override
  public String toString(){
   
    return Arrays.toString(this.members);
  }

  public static void main(String[] args) {


    // create an object home1
  
    Home home = new Home(new Member[]{new Member("Faye", "Mom")});
    Member member1 = new Member("Lam", "Grandmom");
    Home home2 = new Home(member1);
    System.out.println(home);
   
  }
}
