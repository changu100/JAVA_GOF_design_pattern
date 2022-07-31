package part8.chapter19;
public class DayState implements State {
  private static DayState singleton = new DayState();
  private DayState(){}
  public static State getInstance(){
    return singleton;
  }
  public void doClock(Context context, int hour){
    if(hour < 9 || 17 <= hour){
      context.changeState(NightState.getInstance());
    }
  }
  public void doUse(Context context){
    context.recordLog("safe use (Day)");
  }
  public void doAlarm(Context context){
    context.callSecurityCenter("Emergency bell (Day)");
  }
  public void doPhone(Context context){
    context.callSecurityCenter("normal Call (Day)");
  }
  public String toString(){
    return "[Day]";
  }
}
