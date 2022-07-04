package part5.chapter12_2;

public class LaserDecorator extends FighterDecorator {
    
    public LaserDecorator(Fighter _decoratedFighter){
        super(_decoratedFighter);
    }
    
    @Override
    public void Attack(){
        super.Attack();
        System.out.println("레이저 발사!");
    }
}