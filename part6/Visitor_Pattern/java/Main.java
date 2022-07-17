public class Main {
  public static void main(String[] args) {
    Cat kitty = new Cat("kitty", 3);
    kitty.speak();
    
    Visitor nameVisitor = new NameVisitor();
    kitty.accept(nameVisitor);

    Visitor ageVisitor = new AgeVisitor();
    kitty.accept(ageVisitor);

  }
}