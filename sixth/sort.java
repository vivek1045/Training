import java.util.*;
public class sort {    
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
                
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
        System.out.println(" ascending order: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(arr[i] + " ");    
        }    
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
                
        System.out.println("decending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    