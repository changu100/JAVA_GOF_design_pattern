package part6.chapter14;

public class NoSupport extends Support{
    public NoSupport(String name){
        super(name);
    }
    protected boolean resolve (Trouble trouble){
        return false;
    }
}
