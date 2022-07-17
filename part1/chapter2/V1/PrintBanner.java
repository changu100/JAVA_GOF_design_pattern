

// 상속을 이용한 Adapter 생성
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string){
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}