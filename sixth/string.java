import java.util.*;

public class string{
    public static void main(String[] args){
        String s1,s2;
        Scanner in=new Scanner(System.in);
        System.out.println("enter first string:");
        s1=in.nextLine();
        System.out.println("enter second string:");
        s2=in.nextLine();
        if(s1.length() != s2.length()){  
            System.out.println("Second string is not a rotation of first string");  
        }  
        else {  
            s1 = s1.concat(s1);  
            if(s1.indexOf(s2) != -1)  
                System.out.println("Second string is a rotation of first string");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  

    }
}