package part5.chapter12_2;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new WingFighter();
        Fighter f2 = new LaserDecorator(f1);
        Fighter f3 = new PlasmaDecorator(f2);

        f1.Attack();
        f2.Attack();
        f3.Attack();
    }
}


//javac part5/chapter12_2/Main.java
//java part5.chapter12_2.Main