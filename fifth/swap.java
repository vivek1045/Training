import java.util.*;  
public class swap  
{  
    public static void main(String args[])  
    {  
        int x, y;  
        Scanner in = new Scanner(System.in);  
        System.out.print("first number: ");  
        x =in.nextInt();  
        System.out.print("second number: ");  
        y =in.nextInt();  
         
        x =x^y;  
        y=x^y;  
        x=x^y;  

        System.out.print("x = "+x+", y = "+y);  
    }  
}  