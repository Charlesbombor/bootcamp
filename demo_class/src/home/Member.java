package demo_class.src.home;

import java.util.Arrays;

public class Member {
  // attributes
  private String name;
  private String role;
  //private Member [] members;


  // constructors
  public Member (String name, String role){
    this.name = name;
    this.role = role;
  }

  @Override
  public String toString(){
   
    return this.name + this.role;
  }

  
  
}
