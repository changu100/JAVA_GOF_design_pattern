package part3.chapter5;

/*
public class TicketMaker {
    private int ticket = 1000;
    public int getNextTickertNumber(){
        return ticket++;
    }
}
*/

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker(){
        System.out.println("인스턴스를 생성했습니다.");
    }
    
    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    public int getNextTickertNumber(){
        return ticket++;
    }
}
