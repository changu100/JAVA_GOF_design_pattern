package part3.chapter8.factory;

public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption= caption;
    }
    public abstract String makeHTML();
}
