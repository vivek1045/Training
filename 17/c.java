class Thread1 extends Thread
{
     String msg = "";
     Thread1(String msg)
     {
          this.msg = msg;
     }
     public void run()
     {
          try
          {
               while (true)
               {
                    System.out.println(msg);
                    Thread.sleep(1000);
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
class Thread2 extends Thread
{
     String msg = "";
     Thread2(String msg)
     {
          this.msg = msg;
     }
     public void run()
     {
          try
          {
               while (true)
               {
                    System.out.println(msg);
                    Thread.sleep(1000);
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
public class c
{
     public static void main(String[] args)
     {
          Thread1 t1 = new Thread1("Thread1....");
          Thread1 t2 = new Thread1("Thread2....");
          t1.start();
          t2.start();
     }
}