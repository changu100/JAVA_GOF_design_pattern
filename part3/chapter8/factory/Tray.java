package part3.chapter8.factory;
import java.util.ArrayList;

public abstract class Tray extends Item{
    //protected ArrayList tray = new ArrayList();
    protected ArrayList tray = new ArrayList<>();
    public Tray(String caption){
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }

}
