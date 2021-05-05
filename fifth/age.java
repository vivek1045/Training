import java.time.*;
import java.util.*;

public class age{  
   public static void main(String[] args)
    {
        int year,month,day;
        Scanner in = new Scanner(System.in);
        System.out.println("enter year");
        year = in.nextInt();
        System.out.println("enter month");
        month = in.nextInt();
        System.out.println("enter day");
        day = in.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
    
        LocalDate now = LocalDate.now();
    
        Period diff = Period.between(date, now);
 
     System.out.printf("I am "+diff.getYears()+"  years,"+diff.getMonths()+"  months and "+diff.getDays()+ " days old.");
   }
}