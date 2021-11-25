package chapter2.FactoryMethodPattern.concrete;
import chapter2.FactoryMethodPattern.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
