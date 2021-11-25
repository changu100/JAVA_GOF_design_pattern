package chapter2.FactoryMethodPattern.concrete;
import chapter2.FactoryMethodPattern.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
