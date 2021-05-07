import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class mobile {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your Phone number: ");
      String phone = in.next();
      String regex = "\\d{10}";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(phone);
      if(matcher.matches()) {
         System.out.println("valid");
      } else { 
         System.out.println("not valid");
      }
   }
}