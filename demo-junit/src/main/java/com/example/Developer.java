package com.example;


import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)  //  tell the machine yes i want to call super atribute (callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder // extends case use SuperBuilder in both class

public class Developer extends Staff {
  
  private List<String> skills;

  public Developer(int id, String name, List<String> skills){
    super(id, name);
    this.skills = skills;
  }



  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.setSkills(null);
    System.out.println(developer.getSkills());

    Developer developer2 =
      new Developer (new ArrayList<>(List.of("coding", "testing")));

      // Developer(super=Staff(id=0, name=null), skills=[coding, testing])
      System.out.println(developer2.toString());

      System.out.println(developer2.getName());
      System.out.println(developer2.getId());

      Developer developer3 = Developer.builder() //
        .id(2) //
        .name("Lydia") //
        .skills (new ArrayList<>(List.of("coding", "testing"))) //
        .build();

        Developer developer4 = Developer.builder() //
        .id(2) //
        .name("Lydia") //
        .skills (new ArrayList<>(List.of("coding", "testing"))) //
        .build();

        System.out.println(developer3.equals(developer4)); // true

        




  }
}
