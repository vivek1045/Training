import java.util.*;
public class swapstring {  
    public static void main(String args[]) {  
        String s1,s2;
        Scanner in=new Scanner(System.in);
        System.out.println("enter first string:");
        s1=in.nextLine();
        System.out.println("enter second string:");
        s2=in.nextLine();
        s1 = s1 + s2;  
        s2 = s1.substring(0, s1.length() - s2.length());  
        s1 = s1.substring(s2.length());  
        System.out.println("first : " + s1 + " second : " + s2);  
    }  
}  