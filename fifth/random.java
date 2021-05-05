import java.util.*;
class random {
    public static void main( String args[] ) {
      
      int max = 25;
        
      int int_r =new Random().nextInt(max); 
      double double_r=new Random().nextDouble();
      float float_r=new Random().nextFloat();
      
      System.out.println("Random integer:" +  int_r);
      System.out.println("Random float:"+float_r);
      System.out.println("Random double:"+double_r);
    }
}