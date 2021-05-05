import java.util.*;

public class sum  
{  
    public static void main(String[] args)   
    {  
        int i,num, sum1=0,sum2=0;  
          Scanner in = new Scanner(System.in);
          num=in.nextInt();
        for(i = 1; i <= num; ++i)  
        {   
            sum1 = sum1 + i;  
        }  
        sum2=num*(num+1)/2;  
        System.out.println("Sum using loop = " + sum1+"  without loop = "+sum2);  
    }  
}  