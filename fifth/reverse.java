import java.util.*;
public class reverse   
{  
    public static void main(String[] args)   
    {  
        int num, r=0;  
        Scanner in =new Scanner(System.in);
        num = in.nextInt();
        while(num!=0)   
        {  
            int rema = num % 10;  
            r = r * 10 + rema;  
            num = num/10;  
        }  

        System.out.println("reverse number: " + r);  
    }  
}  