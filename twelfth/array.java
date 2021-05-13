import java.util.*;  
public class array 
{  
    public static void main(String args[])  
    {  
        ArrayList<Integer> first=new ArrayList<Integer>();  
        
        first.add(1);  
        first.add(2);  
        first.add(3);  
        first.add(4);  
     
        List<Integer> second=new ArrayList<Integer>();  
        second.add(1);  
        second.add(2);  
        second.add(3);  
        second.add(4); 
        boolean b= first.equals(second); 
        System.out.println(b);    
    }  
}  