
public class Cat {
  String name;
  int age;
  
  Cat (String name, int age){
    this.name = name;
    this.age = age;
  }
  void speak(){
    System.out.println("meow");
  }

  void accept(Visitor visitor){
    System.out.println("use Implementation of Visitor");
    visitor.visit(this);
  }

}
