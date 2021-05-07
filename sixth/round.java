import java.util.*;
import java.lang.*;

class round {
    public static void main( String args[] ) {
      double num;
      Scanner in=new Scanner(System.in);
      System.out.println("enter number");
      num=in.nextDouble();

      String s = Double.toString(Math.round(num));
      System.out.println(s);
    }
}