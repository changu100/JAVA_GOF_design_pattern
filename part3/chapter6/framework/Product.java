
package part3.chapter6.framework;

public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();    
}
