package part8.chapter19;
public class NightState implements State{
  private static NightState singleton = new NightState();
  private NightState(){}
  public static State getInstance(){
    return singleton;
  }
  public void doClock(Context context, int hour){
    if(9 <= hour && hour < 17){
      context.changeState(DayState.getInstance()); 
    }
  }
  public void doUse(Context context){
    context.callSecurityCenter("emergency: Night safe use!");
  }
  public void doAlarm(Context context){
    context.callSecurityCenter("emergency Alarm (Night)");
  }
  public void doPhone(Context context){
    context.recordLog("Night call record");
  }
  public String toString(){
    return"[Night]";
  }
}
