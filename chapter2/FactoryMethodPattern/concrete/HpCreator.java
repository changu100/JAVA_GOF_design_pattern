package chapter2.FactoryMethodPattern.concrete;

import java.util.Date;

import chapter2.FactoryMethodPattern.framework.Item;
import chapter2.FactoryMethodPattern.framework.ItemCreator;

public class HpCreator extends ItemCreator{
    @Override
    protected void requestItemsInfo(){
        System.out.println("데이터베이스에서 회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog(){
        System.out.println("데이터베이스에서 회복 물약 "+ new Date());
    }

    @Override
    protected Item createItem(){
        return new HpPotion();
    }
}
