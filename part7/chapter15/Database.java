package part7.chapter15;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database(){ } //인스턴스생성 불가.
    public static Properties getProperties(String dbname){
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream(filename));
        }catch(IOException e){
            System.out.println("Warning: "+ filename + "is not found");
        }
        return prop;
    }
}
