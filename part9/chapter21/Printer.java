package part9.chapter21;

public class Printer implements Printable{
    private String name;

    public Printer(){
        heavyJob("Printer의 인스턴스 생성 중...");
    }

    public Printer(String name){
        this.name = name;
        heavyJob("Printer의 인스턴스 (" + name +")을 생성 중...");
    }
    @Override
    public String getPrinterName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void print(String string) {
        // TODO Auto-generated method stub
        System.out.println("===" + name + "===");
        System.out.println(string);
    }

    @Override
    public void setPrinterName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    private void heavyJob(String msg){
        System.out.print(msg);
        for (int i =0; i < 5 ; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
            System.out.print(".");
        }
        System.out.println("complete!!");
    }
}
