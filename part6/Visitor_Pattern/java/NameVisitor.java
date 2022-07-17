public class NameVisitor implements Visitor{
  public void visit(Cat elem) {
    System.out.println(elem.name);
  }
}
