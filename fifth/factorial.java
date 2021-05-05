import java.util.*;

class factorial{  
    public static void main(String args[]){  
     int i,f=1;  
     int number;
     Scanner in=new Scanner(System.in);
    number=in.nextInt();
     for(i=1;i<=number;i++){    
         f=f*i;    
     }    
     System.out.println("Factorial is: "+f);    
    }  
   }  