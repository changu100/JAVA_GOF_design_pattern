package part9.chapter21;

public class PrinterProxy implements Printable{
    private String name;    // '이름'
    private Printer real;   // '본인'
    public PrinterProxy(){
    }
    public PrinterProxy(String name){
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        // TODO Auto-generated method stub
        return name;
    }
    @Override
    public void print(String string) {
        // TODO Auto-generated method stub
        realize();
        real.print(string);
    }

    @Override
    public synchronized void setPrinterName(String name) {
        // TODO Auto-generated method stub
        if (real != null){
            real.setPrinterName(name); //  '본인에게도  설정해주어야함.'
        }
        this.name = name;
    }

    private synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}