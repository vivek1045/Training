import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
  
public class firstletter 
{
    public static void main(String[] args) 
    {
        String s;
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
          
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
          
        Matcher m1 = p.matcher(s);
          
        System.out.println("First letter of each word from string \"" + s + "\" : ");
        while (m1.find())
            System.out.print(m1.group());
          
    }
}