package part3.chapter8.listfactory;

import part3.chapter8.factory.*;

public class ListLink extends Link{
    public ListLink(String caption , String url){
        super(caption,url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
