/**
 * @(#)countdown.java
 *
 *
 * @author 
 * @version 1.00 2018/10/20
 */
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class countdown{
       static Timer timer;
         int sec;
         static int interval;
    /**
     * Creates a new instance of <code>countdown</code>.
     */
    public countdown() {
    }
    
    /**
     * @param args the command line arguments
     */
  
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input seconds => : ");
    String secs = sc.nextLine();
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = Integer.parseInt(secs);
    System.out.println(secs);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
            System.out.println(setInterval());

        }
    }, delay, period);
}

private static final int setInterval() {
    if (interval == 1)
        timer.cancel();
    return interval-=1;
}
}