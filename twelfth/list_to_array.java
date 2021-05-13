import java.io.*;
import java.util.List;
import java.util.ArrayList;
  
class list_to_array {
    public static void main(String[] args)
    {
        List<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
  
        Object[] objects = a.toArray();
  

        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}