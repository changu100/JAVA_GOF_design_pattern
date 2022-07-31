package part8.chapter19;
public interface State {
  public void doClock(Context context, int hour); // set time
  public void doUse(Context context); // use safe
  public void doAlarm(Context context); // Alarm
  public void doPhone(Context context); // telephone
}
