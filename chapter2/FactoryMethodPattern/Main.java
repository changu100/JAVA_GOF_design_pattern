package chapter2.FactoryMethodPattern;

import chapter2.FactoryMethodPattern.concrete.HpCreator;
import chapter2.FactoryMethodPattern.concrete.MpCreator;
import chapter2.FactoryMethodPattern.framework.Item;
import chapter2.FactoryMethodPattern.framework.ItemCreator;

public class Main {
    public static void main(String[] args){
        ItemCreator creator;
        Item item;
        
        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
