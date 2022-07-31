package part8.chapter19;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SafeFrame extends Frame implements ActionListener, Context {
  private TextField textClock = new TextField(60);
  private TextArea textScreen = new TextArea(10,60);
  private Button buttonUse = new Button ("use safe");
  private Button buttonAlarm = new Button("call bell");
  private Button buttonPhone = new Button("use tel");
  private Button buttonExit = new Button ("exit");

  private State state = DayState.getInstance();

  public SafeFrame(String title){
    super (title);
    setBackground(Color.lightGray);
    setLayout(new BorderLayout());
    add(textClock, BorderLayout.NORTH);
    textClock.setEditable(false);
    //
    Panel panel = new Panel();
    panel.add(buttonUse);
    panel.add(buttonAlarm);
    panel.add(buttonPhone);
    panel.add(buttonExit);
    // 
    add(panel, BorderLayout.SOUTH);
    //
    pack();
    show();

    //listener setting
    buttonUse.addActionListener(this);
    buttonAlarm.addActionListener(this);
    buttonPhone.addActionListener(this);
    buttonExit.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    System.out.println(e.toString());
    if(e.getSource() == buttonUse){
      state.doUse(this);
    }
    else if(e.getSource() == buttonAlarm){
      state.doAlarm(this);
    }
    else if(e.getSource() == buttonUse){
      state.doPhone(this);
    }
    else if(e.getSource() == buttonUse){
      System.exit(0);
    }
  }

  //set time
  public void setClock(int hour){
    String clockstring = "now time is ";
    if(hour < 10){
      clockstring += "0" +hour + ":00";
    }else{
      clockstring += hour +":00";
    }
    System.out.println(clockstring);
    textClock.setText(clockstring);
    state.doClock(this,hour);
  }

  // change state
  public void changeState(State state){
    System.out.println("change from" + this.state + "to" + state );
    this.state = state;
  }

  //call securityCenter
  public void callSecurityCenter(String msg){
    textScreen.append("call!" + msg + "\n");
    System.out.println("call!" + msg + "\n");
  }

  //log securityCenter
  public void recordLog(String msg){
    textScreen.append("record ..." + msg + "\n");
    System.out.println("record ..." + msg + "\n");
  }
}
