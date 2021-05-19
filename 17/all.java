
import java.util.*;
public class all extends Thread {
    public static void main(String[] args) {
       all t1 = new all();
       all t2 = new all();
       t1.setName("t1");
       t2.setName("t2");
       t1.start();
       t2.start();
       ThreadGroup cGroup = Thread.currentThread().getThreadGroup();
       int noThreads = cGroup.activeCount();
       Thread[] lstThreads = new Thread[noThreads];
       cGroup.enumerate(lstThreads);
       
       for (int i = 0; i < noThreads; i++) 
       {
           System.out.println("Thread No:" + i + " = " + lstThreads[i].getName());
       }
 }
}