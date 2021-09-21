package chapter1_Iterator;
import java.util.*;

public class main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("책1"));
        bookShelf.appendBook(new Book("책2"));
        bookShelf.appendBook(new Book("책3"));
        bookShelf.appendBook(new Book("책4"));

        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
