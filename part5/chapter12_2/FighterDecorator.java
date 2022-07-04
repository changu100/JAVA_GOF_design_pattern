package part5.chapter12_2;

public abstract class FighterDecorator implements Fighter {
    
    private Fighter decoratedFighter;
    public FighterDecorator(Fighter _decoratedFighter){
        decoratedFighter = _decoratedFighter;
    }
    
    @Override
    public void Attack(){
        decoratedFighter.Attack();
    }
}