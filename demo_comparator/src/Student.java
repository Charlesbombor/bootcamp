package demo_comparator.src;

public class Student implements Comparable<Student>{
  
  private int score;
  private String name;

public Student (int score, String name){
  this.score = score;
  this.name = name;
}

public String getName(){
  return this.name;
}

  public Student (int score){
    this.score = score;
  }

  public int getScore(){
    return this.score;
  }

  // puboic int compareTo(T o);
  @Override
  public int compareTo(Student s){
    if (s.getName().compareTo(this.name) > 0) {
      return -1;
      } else if (s.getName().compareTo(this.name) == 0){
        if (s.getScore() > this.score) {
          return 1;
        }else {
          return -1;
        }
       } else {
          return -1;
        }
      }
  

 
  

  @Override
  public String toString(){
    return "Name: " + this.name + " " + String.valueOf(this.score);
  }
}
