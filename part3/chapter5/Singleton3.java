package part3.chapter5;

public class Singleton3 {
    private static Singleton3[] singleton = new Singleton3[]{
        new Singleton3(0),
        new Singleton3(1),
        new Singleton3(2),
    };
    private int id;
    private Singleton3(int id) {                                 
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }
    public static Singleton3 getInstance(int id) {
        return singleton[id];
    }
    //오버라이딩 일반함수의 print 시 호출문
    public String toString() {
        return "[Singleton3 id=" + id + "]";
    }
}
