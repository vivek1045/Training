import java.text.*;
import java.util.*;
public class date {
   public static void main(String[] args) throws Exception {
      Calendar cal = Calendar.getInstance();
      SimpleDateFormat simpleformat = new SimpleDateFormat("E, dd MM yyyy HH:mm:ss Z");
      System.out.println("Today's date and time = "+simpleformat.format(cal.getTime()));

      Format f = new SimpleDateFormat("dd:MM:yyyy hh:mm:ss");
      String str = f.format(new Date());
      System.out.println("Current Date in dd-mm-yyyy hh:mm:ss format = "+str);
    
   }
}