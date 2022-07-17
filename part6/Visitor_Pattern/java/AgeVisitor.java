public class AgeVisitor implements Visitor{
  public void visit(Cat elem)
  {
    System.out.println(elem.age);
  }
}
