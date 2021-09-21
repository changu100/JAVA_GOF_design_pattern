package part3.chapter6;
import part3.chapter6.framework.*;

public class UnderlinePen implements Product{
    
    private char decochar;
    public UnderlinePen(char decochar){
        this.decochar = decochar;
    }

    public void use (String s){
        int length = s.getBytes().length;

        System.out.println(" ");
        System.out.println("\""+ s + "\"");
        System.out.print(" ");
        for(int i = 0; i< length; i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }

    public Product createClone(){
        Product p = null;
        try{
            p = (Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
    
}
