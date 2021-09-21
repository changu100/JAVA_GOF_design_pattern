package part3.chapter5;

public class main{
    public static void main(String[] args){
        System.out.println("start. ");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2)
            System.out.println("동일");
        else
            System.out.println("동일");
        System.out.println("end. ");
            
    }
}