

// 위임 이용한 Adapter 생성
public class PrintBanner implements Print{

    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}