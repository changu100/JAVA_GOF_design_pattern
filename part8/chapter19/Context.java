package part8.chapter19;
public interface Context {
  public void setClock(int hour);
  public void changeState(State state);
  public void callSecurityCenter(String msg);
  public void recordLog(String msg);
}
