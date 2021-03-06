package part6.chapter13;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
