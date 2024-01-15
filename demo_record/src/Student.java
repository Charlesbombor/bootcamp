package demo_record.src;
// Kind of Class
public record Student(String name, int age) {

  // All attributes in "record" have been "final"
  // public void setName(){
  //   this.name = name;
  // }
}
