import java.util.*;
import java.lang.*;

class int_to_str {
    public static void main( String args[] ) {
      int num;
      Scanner in=new Scanner(System.in);
      System.out.println("enter number");
      num=in.nextInt();

      String s = Integer.toString(num);
      System.out.println("int to str : "+s);
    }
}