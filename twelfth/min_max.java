import java.util.*;

public class min_max {
   public static void main(String[] args) {
      List <Integer> list = new ArrayList<>();
      list.add(44);
      list.add(11);
      list.add(22);
      list.add(33);
      System.out.println(list);
      System.out.println("max: " + Collections.max(list));
      System.out.println("min: " + Collections.min(list));
   }
}