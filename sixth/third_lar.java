import java.util.*;
import java.util.Arrays;

public class third_lar{    
    public static void main(String[] args) {        
        int n,temp;  
        Scanner in=new Scanner(System.in); 
        System.out.println("how many element you want to enter ");    
        n=in.nextInt();   
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {   
            arr[i]=in.nextInt();  
        }  
        Arrays.sort(arr);

        System.out.println(arr[n-3]);
    }
}