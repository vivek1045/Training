import java.util.*;
class rotation {    
    public static void main(String[] args) {      
                   
           int n;
           Scanner in=new Scanner(System.in);
           System.out.println("enter length of array: ");  
           n=in.nextInt();
           int [] arr = new int [n];
           int r;
           System.out.println("enter rotation: ");  
           r=in.nextInt();
           System.out.println("enter element into array:");    
           for (int i = 0; i <n; i++) {     
               arr[i] = in.nextInt();     
           }      
                
           for(int i = 0; i < r; i++){    
               int j, l;      
               l = arr[arr.length-1];    
               for(j = arr.length-1; j > 0; j--){        
                   arr[j] = arr[j-1];    
               }      
               arr[0] = l;    
           }    
           
             
           System.out.println("\nArray after right rotation: ");    
           for(int i = 0; i< arr.length; i++){    
               System.out.print(arr[i] + " ");    
           }    
       }    
   }    