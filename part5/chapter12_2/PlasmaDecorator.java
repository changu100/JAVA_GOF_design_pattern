package part5.chapter12_2;

public class PlasmaDecorator extends FighterDecorator {
    
    public PlasmaDecorator(Fighter _decoratedFighter){
        super(_decoratedFighter);
    }
    
    @Override
    public void Attack(){
        super.Attack();
        System.out.println("플라즈마 발사!");
    }
}