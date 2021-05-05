import java.util.*;
public class pattern  
{    
public static void main(String args[])   
{    
  
    int i, j, k;
    Scanner in=new Scanner(System.in);
    System.out.println("enter row::");
    k=in.nextInt();       
    for (i=0; i<k; i++)   
    {      
        for (j=k-i; j>1; j--)   
        {   
            System.out.print(" ");   
        }   

        for (j=0; j<=i; j++ )   
        {       
            System.out.print("* ");   
        }   

    System.out.println();   
    }   
    }   
}  