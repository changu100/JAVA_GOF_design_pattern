package chapter2.FactoryMethodPattern.framework;

public abstract class ItemCreator {
    public Item create(){
        Item item;

        //step 1
        requestItemsInfo();
        //step 2
        item = createItem();
        //step 3
        createItemLog();

        return item;
    }

    //아이템을 생성하기 전에 데이터베이스에서 아이템 요청정보를 요청합니다. 
    abstract protected void requestItemsInfo();
    // 아이템 생성후 ...
    abstract protected void createItemLog();
    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();
      
    
}
