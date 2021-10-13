package part9.chapter20;

public class Main {
    public static void main(String[] args) {
        String[] argss = {"6789"};
        
        if (argss.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        BigString bs = new BigString(argss[0]);
        bs.print();
    }
}

