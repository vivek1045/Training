import java.util.*;  
public class array  
{  
    public static void main(String[] args)   
    {  
        int n;  
        Scanner in=new Scanner(System.in); 
        System.out.println("how many element you want to enter ");    
        n=in.nextInt();   
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {   
            array[i]=in.nextInt();  
        }  
        int[] array2= new int[n];

        for (int i=0; i<n; i++)   
        {  
            array2[i]=array[i];
        }  

        for (int i=0; i<n; i++)   
        {  
            System.out.print("second array::"+array2[i]+" ");  
        }  
    }  
}  