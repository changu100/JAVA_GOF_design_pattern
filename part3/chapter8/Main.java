package part3.chapter8;
import part3.chapter8.factory.*;
//package part3.chapter8;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main part3.chapter8.listfactory.ListFactory");
            System.out.println("Example 2: java Main part3.chapter8.tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        
        // String test = new String("tablefactory.TableFactory");
        // Factory factory = Factory.getFactory(test);
        Link joins = factory.createLink("joins", "http://www.joins.com/");
        Link chosun = factory.createLink("chosun", "http://www.chosun.com/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("newspaper");
        traynews.add(joins);
        traynews.add(chosun);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(kr_yahoo);

        Tray traysearch = factory.createTray("engine");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "yongjin");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
